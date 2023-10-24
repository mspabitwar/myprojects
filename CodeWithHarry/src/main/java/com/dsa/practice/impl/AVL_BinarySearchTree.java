package com.dsa.practice.impl;

import com.dsa.practice.model.TreeNode;

public class AVL_BinarySearchTree {

	public static TreeNode previous = null;

	public static void main(String[] args) {

		TreeNode root = null;
		for (int element = 1; element <= 1000; element++) {
			root = insert(root, element);
		}

		System.out.println("is Binary Search Tree ? " + isBinarySearchTree(root));
		System.out.println("Height of this Binary Search Tree : " + getHeight(root));

	}

	private static boolean isBinarySearchTree(TreeNode root) {
		if (root != null) {
			if (!isBinarySearchTree(root.getLeft())) {
				return false;
			}
			if (previous != null && previous.getData() > root.getData()) {
				return false;
			}
			previous = root;
			return isBinarySearchTree(root.getRight());
		} else {
			return true;
		}
	}

	private static TreeNode insert(TreeNode node, int element) {

		if (node == null) {
			System.out.println("Inserted element " + element + " in BST.");
			return new TreeNode(element);
		}

		if (element == node.getData()) {
			System.out.println("Can't insert element " + element + ", already exist in BST.");
		} else if (element < node.getData()) {
			node.setLeft(insert(node.getLeft(), element));
		} else if (element > node.getData()) {
			node.setRight(insert(node.getRight(), element));
		}

		node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);

		return rotate(node, element);
	}

	public static int getHeight(TreeNode node) {
		return node == null ? -1 : node.getHeight();
	}

	public static int getBalanceFactor(TreeNode node) {
		return node == null ? 0 : (getHeight(node.getLeft()) - getHeight(node.getRight()));
	}

	public static TreeNode rightRotate(TreeNode y) {
		TreeNode x = y.getLeft();
		TreeNode t2 = x.getRight();

		x.setRight(y);
		y.setLeft(t2);

		x.setHeight(Math.max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);
		y.setHeight(Math.max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);

		return x;
	}

	public static TreeNode leftRotate(TreeNode x) {
		TreeNode y = x.getRight();
		TreeNode t2 = y.getLeft();

		y.setLeft(x);
		x.setRight(t2);

		x.setHeight(Math.max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);
		y.setHeight(Math.max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);

		return y;
	}

	public static TreeNode rotate(TreeNode node, int element) {
		// Left Heavy
		if (getBalanceFactor(node) > 1) {
			// Left Left Case
			if (element < node.getLeft().getData()) {
				return rightRotate(node);
			}
			// Left Right Case
			if (element > node.getLeft().getData()) {
				node.setLeft(leftRotate(node.getLeft()));
				return rightRotate(node);
			}
		}

		// Right Heavy
		if (getBalanceFactor(node) < -1) {
			// Right Right Case
			if (element > node.getRight().getData()) {
				return leftRotate(node);
			}
			// Right Left Case
			if (element < node.getRight().getData()) {
				node.setRight(rightRotate(node.getRight()));
				return leftRotate(node);
			}
		}

		return node;
	}
}