package lectures;

public class P_Recursive_tutor {

        public static void main(String[] args) {
//                rc0(1);
                rc1(1);
        }

        public static void rc0(int n) {
                System.out.println(" n-> " + n);
                rc0(n + 2);
        }

        public static void rc1(int n) {
                System.out.println(" n-> " + n);
                if (n + 2 <= 100) {
                        rc1(n + 2);
                }
        }

}
