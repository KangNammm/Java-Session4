package BT;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hàng trong mảng 2 chiều :");
        int row = scanner.nextInt();
        System.out.println("Nhập cột trong mảng 2 chiều :");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập giá trị thứ [" + i + "]["+ j + "] của mảng : ");
                array[i][j] = scanner.nextByte();
            }
        }
        System.out.println("Mảng 2 chiều : ");
        for (int i = 0; i < row; i++) {
            System.out.print("[ ");
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max);
    }
}
