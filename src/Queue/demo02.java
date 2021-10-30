package Queue;

import java.util.ArrayList;
import java.util.List;

public class demo02 {
  static class MyCircularQueue {
    private int[] data;
    private int front,tail;

    public MyCircularQueue(int k) {
      this.data = new int[k];
      front = 0;
      tail = 0;
    }

    public boolean enQueue(int value) {
      if (isFull()) {
        return false;
      }
      data[tail] = value;
      tail = (tail+1)%data.length;
      return true;
    }

    public boolean deQueue() {
      if (isEmpty()) {
        return false;
      }
      front = (front+1)%data.length;
      return true;
    }

    public int Front() {
      if (isEmpty()) {
        return -1;
      }
      return data[front];
    }

    public int Rear() {
      if (isEmpty()) {
        return -1;
      }
      return data[tail];
    }

    public boolean isEmpty() {
      return front==tail;
    }

    public boolean isFull() {
      return (tail+1)%data.length==front;
    }
  }

  public static void main(String[] args) {
    MyCircularQueue q = new MyCircularQueue(4);
    q.enQueue(2);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);
    System.out.println(q.Front());
    System.out.println(q.Rear());
  }
}
