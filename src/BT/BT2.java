package BT;

import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Cho mảng : " + Arrays.toString(array));
        System.out.println("Nhập giá trị muốn thêm : ");
        int addEl = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm vào mảng : ");
        int addIndex = scanner.nextInt();
        if (addIndex < 0 || addIndex > array.length - 1)
            System.out.println("Không thể chèn được phần tử vô mảng");
        else {
            int[] newArray = new int[array.length +1];
            int j = 0;
            for (int i = 0; i <= addIndex; i++) {
                if (i < addIndex){
                    newArray[j] = array[i];
                    j++;
                }else if (i == addIndex){
                    newArray[j] = addEl;
                    j++;
                }
            }
            for (int i = addIndex; i < array.length; i++) {
                newArray[j] = array[i];
                j++;
            }
            System.out.println("Mảng sau khi đã thêm phần tử "+ addEl +"là : " + Arrays.toString(newArray));
        }
    }
}
