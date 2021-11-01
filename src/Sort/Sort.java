package Sort;

public class Sort {
  void bubbleSort(int[] arr) {
    boolean fl = true;
    for (int i = 0; fl; i++) {
      fl = false;
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[j - 1] > arr[j]) {
          fl = true;
          int tmp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = tmp;
        }
      }
    }
  }

  void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int mini = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[mini] > arr[j]) {
          mini = j;
        }
      }
      int tmp = arr[i];
      arr[i] = arr[mini];
      arr[mini] = tmp;
    }
  }

  void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int tmp = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > tmp) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = tmp;
    }
  }

  void quickSort(int[] arr, int L, int R) {
    if(L>=R) {
      return;
    }
    int left = L;
    int right = R;
    int pivot = arr[left];
    while (left<right) {
      while (left<right&&arr[right]>=pivot) {
        right--;
      }
      if (left<right) {
        arr[left] = arr[right];
      }
      while (left<right&&arr[left]<=pivot) {
        left++;
      }
      if (left<right) {
        arr[right]=arr[left];
      }
      if (left>=right) {
        arr[left] = pivot;
      }
    }
    quickSort(arr,L,right-1);
    quickSort(arr, right + 1, R);
  }
}
