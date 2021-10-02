package Array;

public class SparseArray {
  public static void main(String[] args) {

    //创建目标二维数组
      int[][] chessArray1 = new int[11][11];
      chessArray1[1][2] = 1;
      chessArray1[2][4] = 2;

    // 输出目标二维数组
    System.out.println("原始的二维数组");
    for (int[] ints : chessArray1) {
      for (int anInt : ints) {
        System.out.printf("%d ",anInt);
      }
      System.out.println();
    }

    //遍历二维数组得到非零数据个数
      int sum=0;
      for (int[] value : chessArray1) {
          for (int j = 0; j < chessArray1.length; j++) {
              if (value[j] != 0) {
                  sum++;
              }
          }
      }
    System.out.println("原二维数组非零数据个数为："+sum);

    //创建对应的稀疏数组
      int[][] sparseArray = new int[sum+1][3];

    //创建第0行数据
      sparseArray[0][0] = chessArray1.length;
      sparseArray[0][1] = chessArray1.length;
      sparseArray[0][2] = sum;

      //将非零值存放到稀疏数组中
      int count=0;
      for (int i = 0; i < chessArray1.length; i++) {
          for (int j = 0; j < chessArray1.length; j++) {
              if (chessArray1[i][j]!=0) {
                  count++;
                  sparseArray[count][0] = i;
                  sparseArray[count][1] = j;
                  sparseArray[count][2] = chessArray1[i][j];
              }
          }
      }

    // 输出稀疏数组
    System.out.println("========稀疏数组========");
    for (int[] ints : sparseArray) {
      for (int anInt : ints) {
        System.out.printf("%d\t",anInt);
      }
      System.out.println();
    }

    //稀疏数组还原二维数组
    int[][] newArr = new int[sparseArray[0][0]][sparseArray[0][1]];
    for (int i = 1; i < sparseArray.length; i++) {
        newArr[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
    }

    // 打印新数组
    System.out.println("新数组为：");
    for (int[] ints : newArr) {
      for (int anInt : ints) {
        System.out.printf("%d ",anInt);
      }
      System.out.println();
    }
  }
}
