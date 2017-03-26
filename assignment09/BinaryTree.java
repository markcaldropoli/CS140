package assignment09;

import java.io.Serializable;

/**
   A binary tree in which each node has two children.
 */
public class BinaryTree implements Serializable {
	private static final long serialVersionUID = -4746130630622155233L;
	private Node root;

	/**
      Constructs an empty tree.
	 */
	public BinaryTree() { root = null; } 

	/**
      Constructs a tree with one node and no children.
      @param rootData the data for the root
	 */
	public BinaryTree(Object rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
      Constructs a binary tree.
      @param rootData the data for the root
      @param left the left subtree
      @param right the right subtree
	 */
	public BinaryTree(Object rootData, 
			BinaryTree left, BinaryTree right) {
		root = new Node();
		root.data = rootData;
		root.left = left.root;
		root.right = right.root;
	}
	
	public void setData(Object data) {
		root.data = data;
	}
	
	public void setLeft(BinaryTree left) {
		root.left = left.root;
	}
	
	public void setRight(BinaryTree right) {
		root.right = right.root;
	}

	class Node implements Serializable {
		private static final long serialVersionUID = 4101460323588375238L;
		public Object data;
		public Node left;
		public Node right;

		@Override
		public String toString() {
			return data + ", ";
		}

	}

	/**
      Returns the height of the subtree whose root is the given node.
      @param n a node or null
      @return the height of the subtree, or 0 if n is null
	 */
	private static int height(Node n) {
		if (n == null) { return 0; }
		else { return 1 + Math.max(height(n.left), height(n.right)); }
	}

	/**
      Returns the height of this tree.
      @return the height
	 */
	public int height() { return height(root); }

	/**
      Checks whether this tree is empty.
      @return true if this tree is empty
	 */
	public boolean isEmpty() { return root == null; }

	/**
      Gets the data at the root of this tree.
      @return the root data
	 */
	public Object data() { return root.data; }

	/**
      Gets the left subtree of this tree.
      @return the left child of the root
	 */
	public BinaryTree left() { 
		BinaryTree result = new BinaryTree();
		result.root = root.left; 
		return result;
	}

	/**
      Gets the right subtree of this tree.
      @return the right child of the root
	 */
	public BinaryTree right() { 
		BinaryTree result = new BinaryTree();
		result.root = root.right; 
		return result;
	}
	
	public int numLeaves() {
		return numLeaves(root);
	}
	
	private static int numLeaves(Node n) {
		if(n == null) {
			return 0;
		}
		if(n.left == null && n.right == null) {
			return 1;
		}
		return numLeaves(n.left) + numLeaves(n.right);
	}
	
	public int numNodesWithOneChild() {
		return numNodesWithOneChild(root);
	}
	
	private int numNodesWithOneChild(Node n) {
		if(n == null) {
			return 0;
		}
		if((n.left != null || n.right != null) && !(n.left != null && n.right != null)) {
			return 1;
		} else {
			return numNodesWithOneChild(n.left) + numNodesWithOneChild(n.right);
		}
	}
	
	public void swapChildren() {
		swapChildren(root);
	}
	
	private void swapChildren(Node n) {
		if(n != null) {
			swapChildren(n.left);
			swapChildren(n.right);
			Node temp = n.left;
			n.left = n.right;
			n.right = temp;
		}
	}
	
	public void printInOrder() {
		printInOrder(root);
		System.out.println();
	}
	
	private void printInOrder(Node n) {
		if(n != null) {
			printInOrder(n.left);
			System.out.println(n);
			printInOrder(n.right);
		}
	}
}
