package apcs.us;


// 1 設計 class：Item 需求如下
//
//  A、用來記錄商品
//      a. 名稱 name
//      b. 價錢 price
//      c. 數量 quantity
//      d. 是否特價
//
//  B、具備 methods
//      a. getPrice() 可以取得價錢，如果在特價中，是原價的一半
//      b. show() 使用 System.out.println 印出［名稱］［數量］［價錢］
//

public class Item {

    private String name;
    private int price;
    private int quantity;
    private boolean onSale;

    public Item(String iName, int iPrice, int iQuantity, boolean isOnSale) {
        this.name = iName;
        this.price = iPrice;
        this.quantity = iQuantity;
        this.onSale = isOnSale;
    }

    public int getPrice() {
        if (onSale) {
            return price / 2;
        } else {
            return price;
        }
    }

    public void show() {
        System.out.println(name + "  X" + quantity + "  $" + getPrice());
    }
}


// 2 執行程式
// A、產生下列商品，放入陣列 Array
//      名稱  數量  價錢  是否特價
//  -----------------------------
//  1.  Book   3   150    Y
//  2.  Pen   10    45    N
//  3.  Note  20    40    Y
//
// B、用 for 將陣列中的內容取出，執行 show()

class Main{

    public static void main(String[] args) {

        Item[] items = new Item[3] ;
        items[0] = new Item( "Book" , 150 , 3 , true ) ;
        items[1] = new Item( "Pen" , 45 , 10 , false ) ;
        items[2] = new Item( "Note" , 40 , 20 , true ) ;

        // 第 1 種印全部 item 的方式
        for (int i = 0; i < items.length; i++) {
            items[i].show();
        }
        System.out.println("--------------");

        // 第 2 種印全部 item 的方式
        for (Item item : items) {
            item.show();
        }

    }
}
