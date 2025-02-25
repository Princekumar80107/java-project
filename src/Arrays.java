import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        Scanner sc = new Scanner(System.in);

//        System.out.println(arr2[2][0]);
//        System.out.println(arr2[0][1]);
//        System.out.println(arr2[1][3]);

//        int row = arr2.length;
//        int col = arr2[0].length;
//
//        for(int i = 0; i < row; i++) {
//            for(int j = 0; j < col; j++) {
//                System.out.printf("%d ", arr2[i][j]);
//            }
//            System.out.println();
//        }


        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr3 = new int[row][col];

        System.out.println("Enter element = ");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                int num = sc.nextInt();
                arr3[i][j] = num;
            }
        }

        System.out.println("Final Array = ");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%d ", arr3[i][j]);
            }
            System.out.println();
        }
    }
}
