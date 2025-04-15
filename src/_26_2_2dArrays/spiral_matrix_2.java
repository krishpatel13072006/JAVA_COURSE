package _26_2_2dArrays;

public class spiral_matrix_2 {

    public static void matrix(int arr[][])
    {
        int n=arr.length;
        int startr=0;
        int endr=n-1;
        int startc=0;
        int endc=arr[0].length-1;

        while (startr<=endr && startc<=endc)
        {

            //top row
            for (int j = startc; j <=endc ; j++) {
                System.out.print(arr[startr][j]+" ");
            }

            //right
            for (int i = startr+1; i <=endr ; i++) {
                System.out.print(arr[i][endc]+" ");
            }

            //bottom
            for (int j = endc-1; j >=startc ; j--) {
                System.out.print(arr[endr][j]+" ");
            }

            for (int i = endr-1; i >= startr+1; i--) {
                System.out.print(arr[i][startc]+" ");
            }

            startr++;
            endr--;
            startc++;
            endc--;

        }


    }

    public static void display(int arr[][])
    {
        int r=4;
        int c=4;
        for (int i = 0; i <r ; i++) {

            for (int j = 0; j <c ; j++) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };


        display(arr);

        System.out.println("---------------------------------------------------------------------------");

        matrix(arr);
    }
}
