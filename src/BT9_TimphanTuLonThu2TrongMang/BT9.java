package BT9_TimphanTuLonThu2TrongMang;

public class BT9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max1 = max;
                max = arr[i];
            }
        }
        System.out.println(max1);
    }
}
