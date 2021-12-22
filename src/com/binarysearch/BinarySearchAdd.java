package com.binarysearch;

public class BinarySearchAdd<B extends Comparable<B>> {
	class BinaryNode<B>{
		BinaryNode<B> left , right ;
		B data;

		public BinaryNode(B data) {
			this.data = data;
		}
	}
	BinaryNode<B> root;
	public void add(B data) {
		this.root = this.addRecursively(root, data);
	}
	private BinaryNode<B> addRecursively(BinaryNode<B> current,B data) {
		if (current == null) {
			return new BinaryNode<B>(data);
		}
		int compareResult =  data.compareTo(current.data);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, data);
		} else {
			current.right = addRecursively(current.right, data);
		}
		return current;
	}

	public static void main (String[] args) {
		BinarySearchAdd<Integer> binaryTree = new BinarySearchAdd<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
	}
}