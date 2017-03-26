package assignment09;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static ArrayList<Integer> selection(ArrayList<Integer> list) {
		if(list == null) {
			return null;
		}
		if(list.size() == 0) {
			return new ArrayList<Integer>();
		}
		int min = Collections.min(list);
		list.remove(list.indexOf(min));
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(min);
		newList.addAll(selection(list));
		return newList;
	}
	
	public static boolean inOrder(ArrayList<Integer> list) {
		if(list == null || list.size() == 0) {
			return true;
		}
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i) > list.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	private static ArrayList<Integer> less(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<>();
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) < list.get(0)) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
	
	private static ArrayList<Integer> geq(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<>();
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) >= list.get(0)) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
	
	public static ArrayList<Integer> qsort(ArrayList<Integer> list) {
		if(list == null) {
			return null;
		}
		if(list.size() == 0) {
			return new ArrayList<Integer>();
		}
		if(inOrder(list)) {
			ArrayList<Integer> temp = list;
			return temp;
		} else {
			int pivot = list.get(0);
			ArrayList<Integer> temp = qsort(less(list));
			temp.add(pivot);
			temp.addAll(qsort(geq(list)));
			return temp;
		}
	}
}
