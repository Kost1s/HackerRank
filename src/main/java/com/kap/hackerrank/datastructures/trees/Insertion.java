package com.kap.hackerrank.datastructures.trees;

import java.util.Scanner;

/**
 * @author Konstantinos Antoniou
 */
public class Insertion {

    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data =  data;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        //preOrder(root);
    }

    public static Node insert(Node root,int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node node;
            if (data <= root.data) {
                node = insert(root.left, data);
                root.left = node;
            } else {
                node = insert(root.right, data);
                root.right = node;
            }
        }
        return root;
    }

}
