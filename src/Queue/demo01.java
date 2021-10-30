package Queue;

import java.util.ArrayList;
import java.util.List;

public class demo01 {
  static class MyQueue {
    private List<Integer> data;
    private int p_start;

    public MyQueue() {
      data = new ArrayList<>();
      p_start = 0;
    }

    // 添加数据
    public void enQueue(int x) {
      data.add(x);
    }
    // 删除数据
    public void deQueue() {
      if (isEmpty()) {
        return;
      }
      p_start++;
    }
    // 获取头部位置
    public int Front() {
      return data.get(p_start);
    }
    // 判空
    public boolean isEmpty() {
      return p_start >= data.size();
    }
  }

  public static void main(String[] args) {
    MyQueue q = new MyQueue();
    q.enQueue(5);
    q.enQueue(5);

    if (!q.isEmpty()) {
      System.out.println(q.Front());
    }
    q.deQueue();
    if (!q.isEmpty()) {
      System.out.println(q.Front());
    }
    q.deQueue();
    if (!q.isEmpty()) {
      System.out.println(q.Front());
    }
  }
}
