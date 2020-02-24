import sorts.utility.SortUtilities;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] a = {3, 7, 4, 2, 6, 9, 5};
		SortUtilities.printArray(a);
		
		quickSort(a, 0, a.length-1);
		
		SortUtilities.printArray(a);
	}
	
	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		System.out.println("p: "+pivot);
		
		for (int i = low; i < high; i++) {
			if (a[i] < pivot) {
				int temp = a[low];
				a[low] = a[i];
				a[i] = temp;
				low++;
			}
		}
		int temp = a[low];
		a[low] = pivot;
		a[high] = temp;
		
		return low;
	}
	
	private static void quickSort(int[] a, int low, int high) {
		int pivot = partition(a, low, high);
		
		if (pivot -1 > low) {
			quickSort(a, low, pivot-1);
		}
		if (pivot+1 < high) {
			quickSort(a,pivot+1,high);
		}
	}
	
	private static void swap(int[] a, int l, int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}


}
