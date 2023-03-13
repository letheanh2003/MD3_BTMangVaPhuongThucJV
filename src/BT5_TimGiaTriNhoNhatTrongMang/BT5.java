package BT5_TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập Size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size Lớn Quá");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập Phần Tử " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng Của Bạn: " + Arrays.toString(arr));
        int min = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("Phần Tử Nhỏ Nhất Của Mảng : " + min);
    }
}
