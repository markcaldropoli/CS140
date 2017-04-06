package assignment10;

import java.util.List;
import java.util.ArrayList;

/**
   A tree in which each node has an arbitrary number of children.
 */
public class Tree {
	private Node root;

	class Node {
		public Object data;
		public List<Node> children;

		/**
         Computes the size of the subtree whose root is this node.
         @return the number of nodes in the subtree
		 */
		public int size() {
			int sum = 0;
			for (Node child : children) { sum = sum + child.size(); }
			return 1 + sum;
		}
		
		public String toString() {
			return ""+data;
		}
	}

	/**
      Constructs an empty tree.
	 */
	public Tree() {
		root = null;
	}

	/**
      Constructs a tree with one node and no children.
      @param rootData the data for the root
	 */
	public Tree(Object rootData) {
		root = new Node();
		root.data = rootData;
		root.children = new ArrayList<>();
	}

	/**
      Adds a subtree as the last child of the root.
	 */
	public void addSubtree(Tree subtree) {
		root.children.add(subtree.root);
	}

	/**
      Computes the size of this tree.
      @return the number of nodes in the tree
	 */
	public int size() {
		if (root == null) { return 0; }
		else { return root.size(); }
	}
	
	public ArrayList<Node> bftravers() {
		ArrayList<Node> list = new ArrayList<>();
		list.add(root);
		return bftravers(list);
	}
	
	private ArrayList<Node> bftravers(ArrayList<Node> nodeQueue) {
		if(!nodeQueue.isEmpty()) {
			ArrayList<Node> retVal = new ArrayList<>();
			retVal.add(nodeQueue.get(0));
			if(nodeQueue.get(0).children != null) {
				nodeQueue.addAll(nodeQueue.get(0).children);
			}
			nodeQueue.remove(0);
			retVal.addAll(bftravers(nodeQueue));
			return retVal;
		}
		return new ArrayList<>();
	}
	
	public static void main(String[] args) {
		Tree t0 = new Tree(50);
		Tree t1 = new Tree(30);
		Tree t2 = new Tree(65);
		Tree t3 = new Tree(80);
		t0.addSubtree(t1);
		t0.addSubtree(t2);
		t0.addSubtree(t3);

		t1.addSubtree(new Tree(10));
		t1.addSubtree(new Tree(15));
		t1.addSubtree(new Tree(35));
		
		t2.addSubtree(new Tree(40));
		t2.addSubtree(new Tree(65));
		t2.addSubtree(new Tree(70));
		
		t3.addSubtree(new Tree(75));
		t3.addSubtree(new Tree(85));
		t3.addSubtree(new Tree(90));
		
		System.out.println("Size: "+t0.size());
		System.out.println(t0.bftravers());
	}
}
