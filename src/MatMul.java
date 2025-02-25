public class MatMul {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] arr2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int r1 = 2, c1 = 3, r2 = 3, c2 = 2;
        int[][] ans = new int[r1][c2];

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int[] num: ans) {
            for(int i: num) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
