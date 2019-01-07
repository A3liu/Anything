package com.a3.BinaryTree;

public class LinkedBinaryTree {

	Node root;

	public LinkedBinaryTree(Node root) {
		super();
		this.root = root;
	}
	
	/**
	 * 先序遍历,根->左->右
	 * @author 刘耀森
	 * @date 2018年10月15日
	 * @param node
	 */
	public void printBTreePre(Node node) {
		if(node==null)return;
		System.out.print(node.value+"  ");
		printBTreePre(node.leftChild);
		printBTreePre(node.rightChild);
	}
	
	public void printBTreeMid(Node node) {
		if(node==null)return;
		printBTreePre(node.leftChild);
		System.out.print(node.value+"  ");
		printBTreePre(node.rightChild);
	}
	
	public void printBTreeBack(Node node) {
		if(node==null)return;
		printBTreePre(node.leftChild);
		printBTreePre(node.rightChild);
		System.out.print(node.value+"  ");
	}
}
