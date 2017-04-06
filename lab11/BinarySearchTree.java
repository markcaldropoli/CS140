package assignment10;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to implement the Binary Search Tree data structure.
 * The structure is generic in the type of Objects it contains.
 * @param <T> the type of the contained elements this structure is to hold
 */
public class BinarySearchTree<T> {
    private Comparator<T> comparator;
    private T data;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    /**
     * Constructs an empty BST with a Comparator
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(Comparator<T> comp) {
        this.comparator = comp;
    }

    /**
     * Constructs a BST with data and a Comparator
     * @param data the data this BST should hold
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(T data, Comparator<T> comp) {
        this.data = data;
        this.comparator = comp;
    }

    /**
     * Inserts an element into this BST
     * @param element the element to insert into this BST
     */
    public void insert(T element) {
    	if(data == null) {
    		data = element;
    	}
    	if(comparator.compare(element, data) < 0) {
    		if(left == null) {
    			left = new BinarySearchTree<>(comparator);
    			left.data = element;
    		} else {
    			left.insert(element);
    		}
    	}
    	if(comparator.compare(element, data) > 0) {
    		if(right == null) {
    			right = new BinarySearchTree<>(comparator);
    			right.data = element;
    		} else {
    			right.insert(element);
    		}
    	}
    }

    /**
     * Searchs for a given element in this BST
     * @param element the element to search this BST for
     * @return the element in this BST matching the given element, if found,
     *         otherwise null if the given element is not in this BST
     */
    public T find(T element) {
    	if(data == null) {
    		return null;
    	}
    	if(comparator.compare(element, data) == 0) {
    		return data;
    	}
    	if(left != null) {
        	if(comparator.compare(element, data) < 0) {
        		return left.find(element);
        	}
    	}
    	if(right != null) {
        	if(comparator.compare(element, data) > 0) {
        		return right.find(element);
        	}
    	}
    	return null;
    }

    /**
     * Gathers all the elements of this BST in order
     * @return a List holding the elements in this BST in order
     */
    public List<T> getElements() {
    	if(data == null) {
    		return null;
    	}
        List<T> list = new ArrayList<>();
        if(left != null) {
            list.addAll(left.getElements());
        }
        list.add(data);
        if(right != null) {
            list.addAll(right.getElements());
        }
        return list;
    }

    /**
     * Pretty prints the contents of this BST in a horizontal tree-like fashion
     */
    public void prettyPrint() {
        prettyPrint(0);
    }

    private void prettyPrint(int indentLevel) {
    	if(left != null) {
    		left.prettyPrint(indentLevel+1);
    	}
    	String space = "";
    	for(int i=0; i<indentLevel; i++) {
    		space += " ";
    	}
    	System.out.println(space+data);
    	if(right != null) {
    		right.prettyPrint(indentLevel+1);
    	}
    }
    
    public ArrayList<T> bftravers() {
		ArrayList<BinarySearchTree<T>> list = new ArrayList<>();
		list.add(this);
		return bftravers(list);
	}
	
	private ArrayList<T> bftravers(ArrayList<BinarySearchTree<T>> nodeQueue) {
		if(!nodeQueue.isEmpty()) {
			ArrayList<T> retVal = new ArrayList<>();
			retVal.add(nodeQueue.get(0).data);
			if(nodeQueue.get(0).left != null) {
				nodeQueue.add(nodeQueue.get(0).left);
			}
			if(nodeQueue.get(0).right != null) {
				nodeQueue.add(nodeQueue.get(0).right);
			}
			nodeQueue.remove(0);
			retVal.addAll(bftravers(nodeQueue));
			return retVal;
		}
		return new ArrayList<>();
	}

    /**
     * A main method supplied for any debugging needs
     */
    public static void main(String[] args) {
        Comparator<Integer> intComp = (i, j) -> i - j; // lambda expression
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(intComp);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(0);
        tree.insert(3);
        tree.insert(9);
        tree.insert(4);
        System.out.println(tree.getElements());
        tree.prettyPrint();
        System.out.println(tree.bftravers());
    }
}
