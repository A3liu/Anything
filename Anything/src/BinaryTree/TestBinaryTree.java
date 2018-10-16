package BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		//创建节点
		Node node5 = new Node(5, null, null);
		Node node4 = new Node(4, null, node5);
		
		Node node3 = new Node(3, null, null);
		Node node7 = new Node(7, null, null);
		Node node6 = new Node(6, null, node7);
		
		Node node2 = new Node(2, node3, node6);
		
		Node node1 = new Node(1,node4,node2);
		
		LinkedBinaryTree  btree = new LinkedBinaryTree(node1);
		
		
		//先序遍历递归  1  4  5  2  3  6  7
		btree.printBTreePre(btree.root);
		System.out.println();
		//中序遍历递归  4  5  1  3  2  6  7
		btree.printBTreeMid(btree.root);
		System.out.println();
		//后序遍历递归  5  4  3  7  6  2  1 
		btree.printBTreeBack(btree.root);
		System.out.println();
	}
	
	
	
}
