package agilesoftwaredevelopment.designpattern.templatemethod;

public class BubbleSorterBeforeRefactoring {
	static int operations = 0;

	public static int sort(int[] array) {
		operations = 0;
		if (array.length <= 1) {
			return operations;
		}
		for (int i = array.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				compareAndSwap(array, i);
			}
		}
		return operations;
	}

	private static void compareAndSwap(int[] array, int index) {
		if (array[index] > array[index + 1]) {
			swap(array, index);
		}
		operations++;
	}

	private static void swap(int[] array, int index) {
		int temp = array[index];
		array[index] = array[index + 1];
		array[index + 1] = temp;
	}
}
