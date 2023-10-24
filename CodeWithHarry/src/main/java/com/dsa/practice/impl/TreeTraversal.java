package com.dsa.practice.impl;

import com.dsa.practice.model.TreeNode;

public class TreeTraversal {

	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		
		node1.setRight(node2);
		node1.setLeft(node3);
		node3.setRight(node4);
		node3.setLeft(node5);
		
		TreeNode root = node1;
		
		//			4
		//		1 		6
		//	5 		2
		
		System.out.print("PreOrder : [ ");
		preOrder(root);
		System.out.println("]");
		System.out.print("PostOrder : [ ");
		postOrder(root);
		System.out.println("]");
		System.out.print("InOrder : [ ");
		inOrder(root);
		System.out.println("]");
	}

	private static void preOrder(TreeNode root) {
		if(root != null) {
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	private static void postOrder(TreeNode root) {
		if(root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}

	private static void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}
}