
import java.util.ArrayList;
import java.util.Scanner;

public class J10907_P4_病毒演化 {

      public static void main(String[] args) {

            //checkCompare();
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int w = sc.nextInt();
            Node[] nodes = new Node[n];
            ArrayList<Node>[] children = new ArrayList[n];
            for (int i = 0; i < children.length; i++) {
                  children[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                  int a = sc.nextInt() - 1;
                  int b = sc.nextInt() - 1;
                  String c = sc.next();
                  Node node = new Node(c.charAt(0));
                  if (i == 0) {
                        nodes[a] = node;
                  } else {
                        nodes[a] = node;
                        children[b].add(node);      
                  }
            }

      }

      public static void checkCompare() {
            char[] cs = new char[]{'A', 'U', 'C', 'G', '@'};
            for (char c : cs) {
                  System.out.println("CHECK : " + c + "  ------- > ");
                  Node n = new Node(c);

                  if (n.same(Node.A)) {
                        System.out.println("       A : O");
                  } else {
                        System.out.println("       A : X");
                  }

                  if (n.same(Node.C)) {
                        System.out.println("       C : O");
                  } else {
                        System.out.println("       C : X");
                  }

                  if (n.same(Node.G)) {
                        System.out.println("       G : O");
                  } else {
                        System.out.println("       G : X");
                  }

                  if (n.same(Node.U)) {
                        System.out.println("       U : O");
                  } else {
                        System.out.println("       U : X");
                  }

                  if (n.same(Node.X)) {
                        System.out.println("       @ : O");
                  } else {
                        System.out.println("       @ : X");
                  }

            }
      }

}

class Node {

      static final int X = 0b1111;
      static final int A = 0b0001;
      static final int U = 0b0010;
      static final int C = 0b0100;
      static final int G = 0b1000;
      static int[] GENEs = new int[]{A, U, C, G};

      ArrayList<Integer> charMinDist = new ArrayList<>();
      ArrayList<Integer> nChar = new ArrayList<>();

      Node(char c) {
            if (c == X) {
                  add(A, 0);
                  add(U, 0);
                  add(C, 0);
                  add(G, 0);

            } else {
                  add(c, 0);
            }

      }

      void add(int node, int score) {
            nChar.add(node);
            charMinDist.add(score);
      }

      boolean same(int comp) {
            return (comp & nChar) == nChar;
      }

      void checkParent(Node pN) {

            if (nChar == X) {
                  for (int gene : GENEs) {
                        if (pN.same(gene) == true) {

                        } else {

                        }
                  }

            } else {

            }

      }
}
