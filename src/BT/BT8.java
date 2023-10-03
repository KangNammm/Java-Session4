package BT;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String string = scanner.nextLine();
        System.out.println(string);
        System.out.println("Nhập ký tự cần đếm trong chuỗi : ");
        char ch = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự ["+ ch +"] trong chuỗi ["+ string + "] là : " + count + " lần ");
    }
}
