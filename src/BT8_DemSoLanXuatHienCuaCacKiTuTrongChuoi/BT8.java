package BT8_DemSoLanXuatHienCuaCacKiTuTrongChuoi;

import java.util.Arrays;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[][];
        System.out.println("Enter the row of array ->>");
        int row = sc.nextInt();
        System.out.println("Enter the colum of array ->>");
        int colum = sc.nextInt();
        arr = new double[row][colum];
        double sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter the element " + i + "." + j);
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("arr: " + Arrays.deepToString(arr));
        System.out.println("Sum of colum");
        int number = sc.nextInt();
        for (int i = 0; i < row; i++) {
            sum += arr[i][number];
        }
        System.out.println("tổng: " + sum);
    }
}
