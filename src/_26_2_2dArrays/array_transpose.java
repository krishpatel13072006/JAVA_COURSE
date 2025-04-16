package _26_2_2dArrays;

public class array_transpose {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int row=4;int col=4;

        int transpose_arr[][]=new int[col][row];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {

                transpose_arr[j][i]=arr[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(transpose_arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
