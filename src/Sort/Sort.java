package Sort;

public class Sort {
  void bubbleSort(int[] arr) {
    boolean fl = true;
    for (int i = 0; fl /*|| i < arr.length*/; i++) {
      fl = false;
      for (int j = arr.length-1; j > i; j--) {
        if (arr[j-1]>arr[j]) {
          fl = true;
          int tmp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tmp;
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
}
