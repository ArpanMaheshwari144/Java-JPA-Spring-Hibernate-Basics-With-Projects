package trees;

import java.util.Scanner;
public class Tree {

	static Scanner in = null;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
	
	static Node createTree() {
		Node root = null;
		System.out.print("Enter data: ");
		int data = in.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left data for " + data);
		root.left = createTree();
		
		System.out.println("Enter right data for "+ data);
		root.right = createTree();
		
		return root;
	}
	
	// InOrder Traversal -> Left Root Right
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	// PreOrder Traversal -> Root Left Right
	static void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	// PostOrder Traversal -> Left Right Root
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}

class Node{
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}


