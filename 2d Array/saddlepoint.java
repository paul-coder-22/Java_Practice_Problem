public class saddlepoint {
    /*
     * value should be lowest in the row but max in the column -> that we call
     * saddle point
     */
    public static void main(String[] args) {

        int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

        for (int i = 0; i < arr.length; i++) {
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][svj] > arr[i][j]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid Output");
    }
}
