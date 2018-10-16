package BinaryTree;

/**
 * 二叉树的节点
 * @author 刘耀森
 * @date 2018年10月15日
 */
public class Node {

	Object value;
	Node leftChild;
	Node rightChild;
	
	
	public Node(Object value, Node leftChild, Node rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public Node() {
		super();
	}
	
	
	
}
