package zerojudge;


import sun.awt.image.ImageDecoder;

import java.util.Scanner;

public class e841 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBox = sc.nextInt();
        int nM = sc.nextInt();

        long[] box = new long[nBox + 1];
        int[] times = new int[nBox + 1];
        for (int i = 0; i < times.length; i++) {
            times[i] = 1;
        }

        for (int i = 0; i < nM; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            for (int bi = p; bi <= q; bi++) {
                if (r == 1)
                    box[bi] += s;
                if (r == 2)
                    times[bi] *= s;
            }
        }
        long max = 0;
        int maxIdx = -1;
        for (int i = 1; i < box.length; i++) {
            box[i] *= times[i];
            if (box[i] > max) {
                max = box[i];
                maxIdx = i;
            }
        }

        System.out.println(maxIdx + " " + max);


    }

}
