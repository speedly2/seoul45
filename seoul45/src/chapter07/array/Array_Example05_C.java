package chapter07.array;

public class Array_Example05_C {

	public static void main(String[] args) {
		int[] arr1 = new int[] {23, 42, 1, 3, 7, 45};
		int[] arr2 = new int[] {23, 42, 1, 3, 7, 45};
		int[] arr3 = new int[] {23, 42, 1, 3, 7, 45};
		int[] arr4 = new int[] {23, 42, 1, 3, 7, 45};
		int[] arr5 = new int[] {23, 42, 1, 3, 7, 45};
		
		// 1. 버블정렬
		bubbleSort(arr1);
		for (int i : arr1) {
			System.out.printf("%3d", i);
		} System.out.println();
		
		// 2. 선택정렬
		selectionSort(arr2);
		for (int i : arr2) {
			System.out.printf("%3d", i);
		} System.out.println();
		
		// 3. 삽입정렬
		insertionSort(arr3);
		for (int i : arr3) {
			System.out.printf("%3d", i);
		} System.out.println();
		
		// 4. 병합정렬
        mergeSort(arr4, 0, arr4.length - 1);
        for (int i : arr4) {
            System.out.printf("%3d", i);
        } System.out.println();
        
        // 5. 퀵정렬
        quickSort(arr5, 0, arr5.length - 1);
        for (int i : arr5) {
            System.out.printf("%3d", i);
        } System.out.println();
	}

	// 1. 버블 정렬 (Bubble Sort)
	public static void bubbleSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}

	// 2. 선택 정렬 (Selection Sort)
	public static void selectionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minIdx = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIdx]) {
	                minIdx = j;
	            }
	        }
	        int temp = arr[minIdx];
	        arr[minIdx] = arr[i];
	        arr[i] = temp;
	    }
	}

	// 3. 삽입 정렬 (Insertion Sort)
	public static void insertionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 1; i < n; ++i) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	}

	// 4. 병합 정렬 (Merge Sort)
	// left: 현재 부분 배열의 시작 인덱스. right: 현재 부분 배열의 끝 인덱스.
	public static void mergeSort(int[] arr, int left, int right) {
	    if (left < right) {
	        int mid = (left + right) / 2;
	        mergeSort(arr, left, mid);
	        mergeSort(arr, mid + 1, right);
	        merge(arr, left, mid, right);
	    }
	}
	public static void merge(int[] arr, int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;
	    int[] L = new int[n1];
	    int[] R = new int[n2];
	    System.arraycopy(arr, left, L, 0, n1);
	    System.arraycopy(arr, mid + 1, R, 0, n2);
	    int i = 0, j = 0;
	    int k = left;
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	            arr[k] = L[i];
	            i++;
	        } else {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}

	// 5. 퀵 정렬 (Quick Sort)
	// low: 현재 부분 배열의 시작 인덱스. high: 현재 부분 배열의 끝 인덱스.
	public static void quickSort(int[] arr, int low, int high) {
	    if (low < high) {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	public static int partition(int[] arr, int low, int high) {
	    int pivot = arr[high];
	    int i = (low - 1);
	    for (int j = low; j < high; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return i + 1;
	}

}
