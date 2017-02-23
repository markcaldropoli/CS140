package lab06;

public class Partitioner {
	private Parent[] parents;
	private Child[] children;

	public Parent[] getParents() {
		return parents;
	}

	public Child[] getChildren() {
		return children;
	}

	public void partition(Parent[] array) {
		int childrenLength = 0;
		int parentsLength = 0;
		if(array.length == 0) {
			parents = new Parent[0];
			children = new Child[0];
		} else {
			int countParents = 0;
			int countChildren = 0;
			for(int i=0; i<array.length; i++) {
				if(array[i].isChild()) {
					countChildren++;
				} else {
					countParents++;
				}
			}
			parents = new Parent[countParents];
			children = new Child[countChildren];
			for(int i=0; i<array.length; i++) {
				if(array[i].isChild()) {
					children[childrenLength] = (Child) array[i];
					childrenLength++;
				} else {
					parents[parentsLength] = array[i];
					parentsLength++;
				}
			}
		}
	}
}
