package BT6_TinhTongCacSoOMotCotXacDinh;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao cot muon tinh tong: ");
        int c = scanner.nextInt();
        int row = 3;
        int col = 3;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][c];
        }
        System.out.println("Tổng của cột " + c + " là: " + sum);
    }
}
