/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.arbol;
 import java.util.LinkedList;
 import java.util.Queue;
 
 class TreeNode {
     int data;
     TreeNode left, right;
 public TreeNode(int val) {
  data = val;
  left = right = null;
    }
 }
 public class BinaryTree {
     TreeNode root;
 
  public BinaryTree() {
         root = null;
     }
 
 public void insert(int val) {
         root = insertRec(root, val);
     }
 
  private TreeNode insertRec(TreeNode root, int val) {
         if (root == null) {
             return new TreeNode(val);
         }
 
         if (val < root.data) {
             root.left = insertRec(root.left, val);
         } else if (val > root.data) {
             root.right = insertRec(root.right, val);
         }
 
         return root;
     }
 public void levelOrderTraversal() {
         if (root == null) {
             return;
         }
 
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
 
 while (!queue.isEmpty()) {
             int levelSize = queue.size();
 
     for (int i = 0; i < levelSize; i++) {
                 TreeNode current = queue.poll();
                 System.out.print(current.data + " ");
 
       if (current.left != null) {
                     queue.add(current.left);
                 }
        if (current.right != null) {
                     queue.add(current.right);
                 }
             }
             
             System.out.println(); 
         }
     }
     public static void main(String[] args) {
         BinaryTree tree = new BinaryTree();
         tree.insert(2);
         tree.insert(4);
         tree.insert(3);
         tree.insert(1);
         tree.insert(7);
         tree.insert(10);
         System.out.println("Aqui se muestra el arbol binario");
         tree.levelOrderTraversal();
     }
 }
 