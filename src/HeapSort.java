import sorts.utility.SortUtilities;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] a = {1,8,1,6,2,4,8,3,5,6,8,0};
		SortUtilities.printArray(a);
		sort(a);
		SortUtilities.printArray(a);
	}

	/**
	 * Heap Sort array of Edge objects and call heapify
	 * on edges
	 * 
	 * @param edges
	 */
	public static void sort(int edges[]) {
		int n = edges.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(edges, n, i);
		}

		for (int i = n - 1; i >= 0; i--) {
			int temp = edges[0];
			edges[0] = edges[i];
			edges[i] = temp;

			heapify(edges, i, 0);
		}
	}

	/**
	 * Recursively heapify subtree of edges with root i to a heap of size n
	 * 
	 * @param edges
	 * @param n
	 * @param i
	 */
	private static void heapify(int edges[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && edges[l] > edges[largest]) {
			largest = l;
		}
		
		if (r < n && edges[r] > edges[largest]) {
			largest = r;
		}

		if (largest != i) {
			int swap = edges[i];
			edges[i] = edges[largest];
			edges[largest] = swap;

			heapify(edges, n, largest);
		}
	}
}
