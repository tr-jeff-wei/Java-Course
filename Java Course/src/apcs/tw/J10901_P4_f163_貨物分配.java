package apcs.tw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J10901_P4_f163_貨物分配 {

      // dataPW
      static final int P = 0;// parent
      static final int W = 1; // weight
      // dataLR
      static final int L = 0; // left
      static final int R = 1; // right

      public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] dataPW = new int[2 * n][2]; //
            int[][] dataLR = new int[n][2];
            int[] pd = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = n; i < dataPW.length; i++) {
                  dataPW[i][W] = Integer.parseInt(st.nextToken());
            }
            // set products
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < pd.length; i++) {
                  pd[i] = Integer.parseInt(st.nextToken());
            }
            // set tree
            for (int i = 0; i < n - 1; i++) {
                  st = new StringTokenizer(br.readLine());
                  int a = Integer.parseInt(st.nextToken());
                  int b = Integer.parseInt(st.nextToken());
                  int c = Integer.parseInt(st.nextToken());

                  dataLR[a][L] = b;
                  dataLR[a][R] = c;
                  dataPW[b][P] = a;
                  dataPW[c][P] = a;
            }
            /*
             * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int m =
             * sc.nextInt(); int[][] tree = new int[2 * n][4]; int[] pd = new int[m];
             * 
             * for (int i = n; i < tree.length; i++) { tree[i][W] = sc.nextInt(); } // set
             * products for (int i = 0; i < pd.length; i++) { pd[i] = sc.nextInt(); } // set
             * tree
             * 
             * for (int i = 0; i < n - 1; i++) {
             * 
             * int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
             * 
             * tree[a][L] = b; tree[b][P] = a;
             * 
             * tree[a][R] = c; tree[c][P] = a; }
             */

            // method 1
            /*
             * // set depth list ArrayList<Integer> depthList = getDepthOrderList(tree);
             * //int[] depthList = getDepthOrderList2(tree);
             * 
             * // bottom-up : update weight for (int i = depthList.length - 1; i >= 0; i--)
             * { int x = depthList[i]; int p = tree[x][P]; tree[p][W] += tree[x][W]; }
             */
            // method 2
            for (int i = n; i < 2 * n; i++) {
                  int x = dataPW[i][W];
                  int p = dataPW[i][P];
                  while (p > 0) {
                        dataPW[p][W] += x;
                        p = dataPW[p][P];
                  }
            }

            StringBuilder sb = new StringBuilder();
            for (int w : pd) {
                  int r = distProduct2(dataPW, dataLR, 1, w);
                  sb.append(r + " ");
                  // System.out.print(r + " ");
            }
            System.out.println(sb);

      }

      // use recursive function : cost a lot of memory
      public static int distProduct(int[][] dPW, int[][] dLR, int idx, int w) {
            dPW[idx][W] += w;
            if (idx >= dLR.length) {
                  return idx;
            }
            int cL = dLR[idx][L];
            int cR = dLR[idx][R];

            if (dPW[cL][W] <= dPW[cR][W]) {
                  // to left
                  return distProduct(dPW, dLR, cL, w);
            } else {
                  // to right
                  return distProduct(dPW, dLR, cR, w);
            }
      }

      public static int distProduct2(int[][] dPW, int[][] dLR, int idx, int w) {

            while (idx < dLR.length) {
                  dPW[idx][W] += w;
                  int cL = dLR[idx][L];
                  int cR = dLR[idx][R];

                  if (dPW[cL][W] <= dPW[cR][W]) {
                        // to left
                        idx = cL;
                  } else {
                        // to right
                        idx = cR;
                  }
            }
            dPW[idx][W] += w;
            return idx;
      }

}
