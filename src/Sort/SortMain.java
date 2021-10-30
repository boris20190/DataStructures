package Sort;

import java.util.Random;
import java.util.Scanner;

public class SortMain {
  public static void main(String[] args) {
    int[] arr = new int[10];
/*    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }*/
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt(10);
    }
    for (int i : arr) {
      System.out.printf("%d ",i);
    }
    Sort sort = new Sort();
    System.out.println();
    System.out.println("====BubbleSort====");
    int[] a = arr.clone();
    sort.bubbleSort(a);
    for (int i : a) {
      System.out.printf("%d ",i);
    }
    System.out.println();
    System.out.println("====SelectionSort====");
    int[] b = arr.clone();
    sort.selectionSort(b);
    for (int i : b) {
      System.out.printf("%d ",i);
    }
    System.out.println();
    System.out.println("====InsertionSort====");
    int[] c = arr.clone();
    sort.insertionSort(c);
    for (int i : c) {
      System.out.printf("%d ",i);
    }
  }
}