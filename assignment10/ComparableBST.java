package assignment10;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to implement the Binary Search Tree data structure.
 * The structure is generic in the type of Objects it contains.
 * @param <T> the type of the contained elements this structure is to hold
 */
public class ComparableBST<T extends Comparable<? super T>> {
    private T data;
    private ComparableBST<T> left;
    private ComparableBST<T> right;

    /**
     * Constructs an empty BST with a Comparator
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public ComparableBST(T data) {
        this.data = data;
    }

    /**
     * Inserts an element into this BST
     * @param element the element to insert into this BST
     */
    public void insert(T element) {
    	if(data == null) {
    		data = element;
    	}
    	if(data.compareTo(element) < 0) {
    		if(left == null) {
    			left = new ComparableBST<T>(element);
    		} else {
    			left.insert(element);
    		}
    	}
    	if(data.compareTo(element) > 0) {
    		if(right == null) {
    			right = new ComparableBST<T>(element);
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
    	if(data.compareTo(element) == 0) {
    		return data;
    	}
    	if(left != null) {
        	if(data.compareTo(element) < 0) {
        		return left.find(element);
        	}
    	}
    	if(right != null) {
        	if(data.compareTo(element) > 0) {
        		return right.find(element);
        	}
    	}
    	return null;
    }
    
    /**
     * Gets the height of the BST tree
     * @return an int holding the height of the tree
     */
    public int height() {
    	return height(this);
    }
    
    private int height(ComparableBST<T> tr) {
    	if(tr == null) {
    		return 0;
    	}
    	return 1 + Math.max(height(tr.left), height(tr.right));
    }
    
    public boolean heightBalanced() {
    	return heightBalanced(this);
    }
    
    private boolean heightBalanced(ComparableBST<T> tr) {
    	if(tr == null) {
    		return true;
    	}
    	if(Math.abs(height(tr.left) - height(tr.right)) <= 1 &&
    			(heightBalanced(tr.left) && heightBalanced(tr.right))) {
    		return true;
    	}
    	return false;
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
		ArrayList<ComparableBST<T>> list = new ArrayList<>();
		list.add(this);
		return bftravers(list);
	}
	
	private ArrayList<T> bftravers(ArrayList<ComparableBST<T>> nodeQueue) {
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
}
