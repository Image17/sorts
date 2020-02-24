import sorts.utility.SortUtilities;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 5, 8, 1, 3, 4 };

		SortUtilities.printArray(a);
	}

	private static void merge(int[] a, int left, int middle, int right) {
		
	}

	private static void mergeSort(int[] a, int left, int right) {

		if (left < right) {
			int middle = (left + right) / 2;

			mergeSort(a, left, middle);
			mergeSort(a, middle + 1, right);

			merge(a, left, middle, right);
		}
	}

}
