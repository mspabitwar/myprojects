package com.dsa.practice.impl;

import com.dsa.practice.model.TreeNode;

public class BinarySearchTree {

	public static TreeNode previous = null;
	
	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(1);
		
		node1.setRight(node2);
		node1.setLeft(node3);
		node3.setRight(node4);
		node3.setLeft(node5);
		
		TreeNode root = node1;
		
		//			5
		//		3 		6
		//	1 		4
		
		System.out.print("InOrder : [ ");
		inOrder(root);
		System.out.println("]");
		
		System.out.println("is Binary Search Tree ? " + isBinarySearchTree(root));
		
		int element = 6;
		
		System.out.print("Searching element using recursive approach : ");
		TreeNode node = searchRecursive(root, element);
		if(node == null) {
			System.out.println("Element " + element + " not found in BST.");
		} else {
			System.out.println("Element " + element + " found in BST.");
		}
		
		System.out.print("Searching element using iterative approach : ");
		node = searchIterative(root, element);
		if(node == null) {
			System.out.println("Element " + element + " not found in BST.");
		} else {
			System.out.println("Element " + element + " found in BST.");
		}
		
		element = 7;
		System.out.println("Inserting element " +  element +" : in BST.");
		insert(root, element);
		
		System.out.print("InOrder : [ ");
		inOrder(root);
		System.out.println("]");
		
		element = 6;
		System.out.println("Deleting element " +  element +" : from BST.");
		delete(root, element);
		
		System.out.print("InOrder : [ ");
		inOrder(root);
		System.out.println("]");
	}

	private static void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}
	
	private static boolean isBinarySearchTree(TreeNode root) {
		if(root != null) {
			if(!isBinarySearchTree(root.getLeft())) {
				return false;
			}
			if(previous != null && previous.getData() > root.getData()) {
				return false;
			}
			previous = root;
			return isBinarySearchTree(root.getRight());
		} else {
			return true;
		}
	}
	
	private static TreeNode searchRecursive(TreeNode root, int element) {
		if(root == null) {
			return null;
		}
		if(element == root.getData()) {
			return root;
		} else if(element < root.getData()) {
			return searchRecursive(root.getLeft(), element);
		} else if(element > root.getData()) {
			return searchRecursive(root.getRight(), element);
		}
		return null;
	}
	
	private static TreeNode searchIterative(TreeNode root, int element) {
		while(root != null) {
			if(element == root.getData()) {
				return root;
			} else if(element < root.getData()) {
				root = root.getLeft();
			} else if(element > root.getData()) {
				root = root.getRight();
			}
		}
		return null;
	}
	
	private static void insert(TreeNode root, int element) {
		TreeNode previous = null;
		while(root != null) {
			previous = root;
			if(element == root.getData()) {
				System.out.println("Can't insert element " +  element + ", already exist in BST.");
				return;
			} else if(element < root.getData()) {
				root = root.getLeft();
			} else if(element > root.getData()) {
				root = root.getRight();
			}
		}
		
		TreeNode newNode = new TreeNode(element);
		if(element < previous.getData()) {
			previous.setLeft(newNode);
		} else {
			previous.setRight(newNode);
		}
		System.out.println("Inserted element " +  element + " in BST.");
	}
	
	private static TreeNode delete(TreeNode root, int element) {
		if(root == null) {
			return null;
		}
		if(root.getLeft() == null && root.getRight() == null) {
			if(element == root.getData()) {
				return null;
			} else {				
				return root;
			}
		}
		//Search for the node to be deleted
		if(element < root.getData()) {
			root.setLeft(delete(root.getLeft(),element));
		} else if(element > root.getData()) {
			root.setRight(delete(root.getRight(),element));
		} else {
			//found the node to be deleted and now apply delete strategy
			TreeNode inorderPredecessor = findInorderPredecessor(root);
			if(inorderPredecessor != null) {				
				root.setData(inorderPredecessor.getData());
				root.setLeft(delete(root.getLeft(), inorderPredecessor.getData()));
			} else {
				TreeNode inorderSucccessor = findInorderSuccessor(root);
				root.setData(inorderSucccessor.getData());
				root.setRight(delete(root.getRight(), inorderSucccessor.getData()));
			}
		}
		return root;
	}
	
	private static TreeNode findInorderPredecessor(TreeNode root) {
		//rightmost element in left subtree
		root = root.getLeft();
		if(root != null) {			
			while(root.getRight() != null) {
				root = root.getRight();
			}
			return root;
		} else {
			return null;
		}
	}
	
	private static TreeNode findInorderSuccessor(TreeNode root) {
		//leftmost element in right subtree
		root = root.getRight();
		if(root != null) {			
			while(root.getLeft() != null) {
				root = root.getLeft();
			}
			return root;
		} else {
			return null;
		}
	}
}