package _26_2_2dArrays;

public class Diagonal_sum {

    public static void diagonalsum(int arr[][]) {

        int sum=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[0].length ; j++) {

                if(i == j)
                {
                    sum=sum+arr[i][j];
                }
                if((i+j) == arr.length-1)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        diagonalsum(arr);
    }
}
