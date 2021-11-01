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
    if (L >= R) {
      return;
    }
    int left = L;
    int right = R;
    int pivot = arr[left];
    while (left < right) {
      while (left < right && arr[right] >= pivot) {
        right--;
      }
      if (left < right) {
        arr[left] = arr[right];
      }
      while (left < right && arr[left] <= pivot) {
        left++;
      }
      if (left < right) {
        arr[right] = arr[left];
      }
      if (left >= right) {
        arr[left] = pivot;
      }
    }
    quickSort(arr, L, right - 1);
    quickSort(arr, right + 1, R);
  }

  void mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return;
    }
    sort(arr, 0, arr.length - 1);
  }

  private void sort(int[] arr, int left, int right) {
    if (left == right) {
      return;
    }
    int mid = left + ((right - left) >> 1);
    sort(arr, left, mid);
    sort(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }

  private void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = 0;
    int p1 = left;
    int p2 = mid + 1;
    while (p1 <= mid && p2 <= right) {
      temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
    }
    while (p1 <= mid) {
      temp[i++] = arr[p1++];
    }
    while (p2 <= right) {
      temp[i++] = arr[p2++];
    }
    for (i = 0; i < temp.length; i++) {
      arr[left + i] = temp[i];
    }
  }
}
