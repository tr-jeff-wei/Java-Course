
package zerojudge;
import java.util.Scanner;

class D1001_bst {

    static void traverse(Node n) {
        if (n == null) {
            return;
        }
        // 前序
        System.out.print(n.v + " ");
        traverse(n.left);
        traverse(n.right);

        // 中序：排序用
        // traverse(n.left);
        // System.out.println(n.v);
        // traverse(n.right);
    }

    public static Node search(int targetV) {
        return search(root, targetV);
    }

    public static Node search(Node n, int v) {
        if (v == n.v) {
            return n;
        } else if (v < n.v) {
            // 向左看
            if (n.left != null) {
                return search(n.left, v);
            }
        } else {
            // 向右看
            if (n.right != null) {
                return search(n.right, v);
            }
        }

        return null;
    }

    public static void add(Node n, int v, String name) {
        // ?
        if (v == n.v) {
            System.out.println("數字:" + v + " 已存在");
        } else if (v < n.v) {
            // 向左看
            if (n.left == null) {
                n.left = new Node(v, name);
            } else {
                add(n.left, v, name);
            }
        } else {
            // 向右看
            if (n.right == null) {
                n.right = new Node(v, name);
            } else {
                add(n.right, v, name);
            }
        }
    }

    public static Node getMin(Node n) {
        if (n.left != null) {
            return getMin(n.left);
        } else {
            return n;
        }
    }

    public static Node getMax(Node n) {
        if (n.right != null) {
            return getMax(n.right);
        } else {
            return n;
        }
    }

    static Node root = null;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (root == null) {
                    root = new Node(x, null);
                } else {
                    add(root, x, null);
                }
            }
            traverse(root);
            System.out.println();
            root = null;
            // System.out.println("============");
        }
    }

}

class Node {
    String name;
    int v;
    Node left;
    Node right;

    Node(int v, String name) {
        this.v = v;
        this.name = name;
    }

    void show() {
        System.out.println(v + " : " + name);
    }
}
