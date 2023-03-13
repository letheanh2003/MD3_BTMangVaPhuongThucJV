package BT2_ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        // input arr.length
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Độ Dài Mảng: ");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Nhập Phần Tử: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần Tử Muốn Thêm Vào: ");
        int[] newArr = new int[arrLength + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        // new arr{0,1,2,3} 4
        newArr[newArr.length - 1] = sc.nextInt();
        System.out.println(Arrays.toString(newArr));
        // them phan tu => nhap => length = arraylength +  1 => them no vao cuoi => in ra
    }
}
