package com.binarysearch;

import org.w3c.dom.Node;

public class BinaryNodeSearch<B extends Comparable<B>> {
	class Node<B>{
		private Node<B> left , right ;
		private B data;

		public Node(B data) {
			this.data = data;
		}
		Node<B> root;
		public void add(B data) {
			this.root = this.addRecursively(root, data);
		}
		private Node<B> addRecursively(Node<B> current,B data) {
			if (current == null) {
				return new Node<B>(data);
			}
			int compareResult =  ((Comparable<B>) data).compareTo(current.data);
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
		public boolean search(Node node , B data) {
			if(node == null) {
				return false;
			}
			
			boolean isPresent = false;
			while(node != null) {
				if(((Comparable<B>) data).compareTo(node.data)) {
					node = node.left;
				}else if((boolean) ((Comparable<B>) data)).compareTo(node.data)) {
					node = node.right;
				}else {
					isPresent = true;
					break;
				}
			}
			return isPresent;
		}
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
