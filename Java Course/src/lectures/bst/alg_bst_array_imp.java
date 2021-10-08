/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectures.bst;


class bst_arr {
    public static void main(String[] args) {
        
        Integer[] bst = new Integer[50] ;

        int[] test = {6,3,9,1,5,12} ;
        for (int x : test) {
            add(bst,1,x) ;
        }
        // System.out.println(Arrays.toString(bst));

        traverse(bst, 1);
    }

    static void add(Integer[] bst , int i , Integer value ){
        if( bst[i]==null ){
            bst[i] = value ;
            return ;
        }

        if( bst[i]==value){
            System.out.println("BST 已經存在 "+value+" ，無法加入！");
        }else if( value < bst[i]){
            // 左兒子
            add( bst , i*2 , value ) ;
        }else{
            // 右兒子
            add(bst, i * 2+1, value);
        }
    }


    static void traverse( Integer[] bst , int i ){

        if( bst[i] == null ){
            return ;
        }

        // inorder : 中序搜尋（依大小印出）
        traverse(bst , i*2) ; // left
        System.out.print( bst[i]+" ");
        traverse(bst , i*2+1) ; // right
    }
}
