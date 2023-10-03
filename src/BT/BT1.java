package BT;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị phần tử cần xóa : ");
        int deleteEl = scanner.nextInt();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == deleteEl){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
                break;
            }
        }
    }
}
