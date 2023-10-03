package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng :");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị thứ " + (i + 1) + " trong mảng :");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int max1 = array[0], max2 = array[0];
        for (int i = 0; i < size; i++) {
            if (max1 < array[i]){
                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i] && array[i] != max1) {
                max2 = array[i];
            }
        }
        System.out.println("Số lớn thứ 2 trong mảng là : " + max2);
    }
}
