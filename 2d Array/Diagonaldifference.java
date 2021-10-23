public class Diagonaldifference {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            left += arr[i][i];
            right += arr[arr.length - 1 - i][i];
        }
        System.out.println(left);
        System.out.println(right);
        System.out.println(left - right);
    }
}
