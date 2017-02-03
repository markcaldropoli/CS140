package lab03;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFromFile {
	private int[] array;

	public ArrayFromFile(String filename) {
		try(Scanner sc = new Scanner(new File(filename))) {
			int len = sc.nextInt();
			array = new int[len];
			for(int i=0; i<len; i++) {
				array[i] = sc.nextInt();
			}
		} catch(Exception e) {
			array = new int[0];
		}
	}

	public int[] getArray() {
		return array;
	}

	public String toString() {
		return Arrays.toString(array);
	}

	public void removeOddElements() {
		int even = 0;
		for(int element : array) {
			if(element%2 == 0) {
				even++;
			}
		}
		int[] temp = new int[even];
		int index = 0;
		for(int element : array) {
			if(element%2 == 0) {
				temp[index] = element;
				index++;
			}
		}
		array = temp;
	}
}
