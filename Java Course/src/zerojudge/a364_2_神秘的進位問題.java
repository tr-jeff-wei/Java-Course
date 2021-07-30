package zerojudge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuan
 */
public class a364_2_神秘的進位問題 {

      public static void main(String[] args) {

            int[][] mat = new int[9][3];
            for (int m = 0; m < mat.length; m++) {
                  mat[m][0] = c_m_1(m);
                  mat[m][1] = c_m_2(m);
                  mat[m][2] = c_m_3(m, mat);
            }
            
            for (int i = 0; i < mat.length; i++) {
                  int[] is = mat[i];
                  System.out.print(i+" =>  ");
                  for (int j = 0; j < is.length; j++) {
                        System.out.print(mat[i][j]+"  ");                        
                  }
                  System.out.println("");
                  
            }
      }

      static int c_m_1(int m) {
            return m;
      }

      static int c_m_2(int m) {
            if (m == 2) {
                  return 1;
            }
            if (m < 2) {
                  return 0;
            }

            // m!  /  (2 * (m-2)!)
            // m*(m-1)/2
            return m * (m - 1) / 2;
      }

      static int c_m_3(int m, int[][] mat) {
            if (m == 3) {
                  return 1;
            }
            if (m < 3) {
                  return 0;
            }

            // m!  /  (6 * (m-3)!)          
            //return c_m_2(m)*(m-2)/3;
            //return m*(m-1)*(m-2)/6;
            return mat[m][1] * (m - 2) / 3;
      }

}
