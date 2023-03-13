package BT1_ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newArr = new int[array.length - 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Vị Trí Muốn Xóa: ");
        int N;
        N = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == N) {
                continue;
            }
            newArr[k++] = array[i];
            System.out.println(Arrays.toString(newArr));
        }
        System.out.println("Mảng Cũ: " + Arrays.toString(array));
        System.out.println("Mảng Mới: " + Arrays.toString(newArr));
    }
}
