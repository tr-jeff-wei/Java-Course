/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectures.bst;

/**
 *
 * @author chuan
 */
public class alg_binary_search_tree {

      public static void main(String[] args) {
            
            
            
            BSTree tree = new BSTree() ;
            int[] vs = {5,2,1,7,6,3,4,9} ;
            tree.buildTree(vs);
            Node target = tree.search(22);
            System.out.println(target);
      }
}

class BSTree {

      Node root;

      void buildTree(int[] data) {
            for (int v : data) {
                  add(v);
            }
      }

      void add(int v) {
            root = add(root, v);
      }

      Node add(Node node, int v) {
            if (node == null) {
                  return new Node(v);
            }

            if (node.value == v) {
                  System.out.println("數值 : " + v + " 已經存在，不新增！！");
            } else if (node.value > v) {
                  // left child
                  node.left = add(node.left, v);
            } else {
                  // right child
                  node.right = add(node.right, v);
            }
            return node;
      }

      Node search(int v) {
            return search(root, v);
      }

      Node search(Node node, int v) {
            if (node == null) {
                  return null;
            }

            if (v == node.value) {
                  return node;                   // traverse stop
            } else if (v < node.value) {
                  return search(node.left, v); // traverse left
            } else {
                  return search(node.right, v); // traver right
            }

      }

      Node getMin() {
            if (root == null) {
                  return null;
            }
            Node minNode = root;
            while (minNode.left != null) {
                  minNode = minNode.left;
            }
            return minNode;
      }

      Node getMax() {
            if (root == null) {
                  return null;
            }
            Node maxNode = root;
            while (maxNode.right != null) {
                  maxNode = maxNode.right;
            }
            return maxNode;
      }

}

class Node {

      Node left;
      Node right;
      int value;

      Node(int v) {
            value = v;
      }

}
