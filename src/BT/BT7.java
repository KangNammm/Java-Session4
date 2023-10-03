package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Khai báo cột trong ma trận :");
        num = scanner.nextInt();
        int[][] array = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Nhập giá trị thứ [" + i +"]["+ j +"] : ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận hình vuông : ");
        for (int i = 0; i < num; i++) {
            System.out.print(Arrays.toString(array[i]));
        }
        System.out.println();
        int sumMain = 0;
        System.out.println("Các giá trị trên đường chéo chính là : ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i][i] + " ");
            sumMain += array[i][i];
        }
        System.out.println();

        int sumPhu = 0;
        System.out.println("Các giá trị trên đường chéo phụ là : ");
        for (int j = 0; j < num; j++) {
            System.out.print(array[j][num - j - 1] + " ");
            sumPhu += array[j][num - j - 1];
        }
        System.out.println();

        System.out.println("Tổng của các số trên đường chéo chính : " + sumMain);
        System.out.println("Tổng của các số trên đường chéo phụ : " + sumPhu);
    }
}
