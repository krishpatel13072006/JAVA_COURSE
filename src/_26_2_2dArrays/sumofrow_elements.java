package _26_2_2dArrays;

public class sumofrow_elements {

    public static void sum(int arr[][]) {

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
//            sum+=arr[0][j];
//            sum+=arr[1][j];
//            sum+=arr[2][j];
//            sum+=arr[3][j];
                sum+=arr[i][j];
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

        sum(arr);
    }
}
