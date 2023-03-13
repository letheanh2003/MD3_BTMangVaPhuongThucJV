package BT7_MangHaiChieu;


public class BT7 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng của đường chéo là: " + sum);
    }
}
