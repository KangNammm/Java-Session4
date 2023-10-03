package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Chọn 1 cột bạn muốn tính tổng : ");
        int column = scanner.nextInt();
        int sum = 0;
        System.out.println("Cột " + column + " gồm các phần tử : ");
        if (column >= 0 && column <= 3){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][column] + " ");
                sum += arr[i][column];
            }
        }else {
            System.out.println("Cột không tồn tại !");
        }
        System.out.println();
        System.out.println("Tổng của cột " + column + " trong mảng là : " + sum);
    }
}
