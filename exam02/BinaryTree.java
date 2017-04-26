package exam02;

public class BinaryTree {
    private IntNode root;

    class IntNode {
        public int data;
        public IntNode left;
        public IntNode right;
    }

    public BinaryTree() {

    }

    public BinaryTree(int data) {
        root = new IntNode();
        root.data = data;
    }

    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
        root = new IntNode();
        root.data = data;
        if (left != null) {
            root.left = left.root;
        }
        if (right != null) {
            root.right = right.root;
        }
    }
    
    public int numNodes() {
    	if(root == null) {
    		return 0;
    	}
    	return numNodes(root);
    }
    
    private int numNodes(IntNode node) {
    	if(node.left != null && node.right != null) {
    		return 1 + numNodes(node.left) + numNodes(node.right);
    	}
    	if(node.left != null) {
    		return 1 + numNodes(node.left);
    	}
    	if(node.right != null) {
    		return 1 + numNodes(node.right);
    	}
    	return 1;
    }
    
    public int numNonLeaves() {
    	if(root == null) {
    		return 0;
    	}
    	return numNonLeaves(root);
    }
    
    private int numNonLeaves(IntNode node) {
    	if(node.left != null && node.right != null) {
    		return 1 + numNonLeaves(node.left) + numNonLeaves(node.right);
    	}
    	if(node.left != null) {
    		return 1 + numNonLeaves(node.left);
    	}
    	if(node.right != null) {
    		return 1 + numNonLeaves(node.right);
    	}
    	return 0;
    }
}
