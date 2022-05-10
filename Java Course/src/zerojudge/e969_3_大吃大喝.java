package zerojudge;


import java.util.Scanner;

public class e969_3_大吃大喝 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            int money = sc.nextInt();
            int min = sc.nextInt();
            int k = sc.nextInt();
            
            int time = 0;
            while (true) {
                  String msg = "";
                  if (k == 0) {
                        money = money - 32;
                        msg = ": Wayne eats an Apple pie, and now he ";
                        k = 1;
                  } else {
                        msg = ": Wayne drinks a Corn soup, and now he ";
                        money = money - 55;
                        k = 0;
                  }
                  if (money < 0) {
                        break;
                  }

                  if (money == 0) {
                        System.out.println(time + msg + "doesn't have money.");
                        break;
                  } else if (money == 1) {
                        System.out.println(time + msg + "has " + money + " dollar.");
                  } else {
                        System.out.println(time + msg + "has " + money + " dollars.");
                  }

                  time = time + min;
            }

            if (time == 0) {
                  System.out.println("Wayne can't eat and drink.");
            }
           
      }
}
