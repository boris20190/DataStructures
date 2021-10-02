package Queue;
//数组队列
//没有达到复用效果——需要改进成环形数组——取模
import java.util.Scanner;

public class ArrayQueue {
  public static void main(String[] args) {
    Queue queue = new Queue(3);
    boolean loop = true;
    while (loop) {
      System.out.println("s(show)显示队列");
      System.out.println("e(exit)退出程序");
      System.out.println("a(add)添加数据到队列");
      System.out.println("g(get)从队列中取出数据");
      System.out.println("h(head)查看队列头的数据");
      Scanner scanner = new Scanner(System.in);
      char key = scanner.next().charAt(0);
      switch (key) {
        case 's' -> queue.showQueue();
        case 'e' -> {
          loop = false;
          scanner.close();
        }
        case 'a' -> {
          System.out.println("输入要添加的数据：");
          int value = scanner.nextInt();
          queue.addQueue(value);
        }
        case 'g' -> {
          try{
            int res = queue.getQueue();
            System.out.printf("取出的数据时%d",res);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        }
        case 'h' -> {
          try{
            int res = queue.headQueue();
            System.out.printf("队列头数据为%d",res);
          }catch (Exception e) {
            System.out.println(e.getMessage());
          }
        }
      }
    }
    System.out.println("程序结束！");
  }

  static class Queue {
    private final int maxSize;
    private int front;
    private int rear;
    private final int[] arr;

    public Queue(int maxSize) {
      this.maxSize = maxSize;
      arr = new int[maxSize];
      front = -1;
      rear = -1;
    }

    public boolean isFull() {
      return rear == maxSize - 1;
    }

    public boolean isEmpty() {
      return rear == front;
    }

    public void addQueue(int n) {
      if (isFull()) {
        System.out.println("队列满，无法增加数据");
        return;
      }
      rear++;
      arr[rear] = n;
    }

    public int getQueue() {
      if (isEmpty()) {
        throw new RuntimeException("队列空，不能去除数据"); //throw抛出异常有return作用
      }
      front++;
      return arr[front];
    }

    public void showQueue() {
      if (isEmpty()) {
        System.out.println("队列为空，无法输出数据！");
        return;
      }
      for (int i = 0; i < arr.length; i++) {
        System.out.printf("arr[%d]=%d\n",i,arr[i]);
      }
    }

    public int headQueue() {
      if (isEmpty()) {
        throw new RuntimeException("队列空，无输出");
      }
      return arr[front+1];
    }
  }
}
