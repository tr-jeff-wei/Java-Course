package zerojudge;


import java.util.Scanner;

public class e807_降雨量統計 {

      public static void main(String[] args) {
            //上午 (morning)、下午 (afternoon)、晚間 (night)、清晨 (early morning)
            double[] mane = new double[4];
            double[] wday = new double[7];

            Scanner sc = new Scanner(System.in);

            for (int weekday = 0; weekday < 7; weekday++) {
                  for (int i = 0; i < 4; i++) {
                        double v = sc.nextDouble();
                        mane[i] = mane[i] + v;
                        wday[weekday] = wday[weekday] + v;
                  }
            }

            
            int maxWday = 0;
            for (int i = 0; i < wday.length; i++) {
                  if (wday[i] > wday[maxWday]) {
                        maxWday = i;
                  }
            }
            
            System.out.println(maxWday + 1);
            
            int maxMANE = 0;
            for (int i = 0; i < mane.length; i++) {
                  if (mane[i] > mane[maxMANE]) {
                        maxMANE = i;
                  }
            }

            //上午 (morning)、下午 (afternoon)、晚間 (night)、清晨 (early morning)
            if (maxMANE == 0) {
                  System.out.println("morning");
            } else if (maxMANE == 1) {
                  System.out.println("afternoon");
            } else if (maxMANE == 2) {
                  System.out.println("night");
            } else {
                  System.out.println("early morning");
            }
            
      }
}
