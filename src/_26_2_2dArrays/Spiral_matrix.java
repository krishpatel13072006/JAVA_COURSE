package _26_2_2dArrays;

public class Spiral_matrix {

    public static void spiral(int arr[][]) {
        int rows = arr.length; // Total number of rows
        int cols = arr[0].length; // Total number of columns
        int startr = 0; // Starting row index
        int endr = rows - 1; // Ending row index
        int startc = 0; // Starting column index
        int endc = cols - 1; // Ending column index

        while (startr <= endr && startc <= endc) {
            // Top row
            for (int j = startc; j <= endc; j++) {
                System.out.print(arr[startr][j] + " ");
            }
            startr++;

            // Right column
            for (int i = startr; i <= endr; i++) {
                System.out.print(arr[i][endc] + " ");
            }
            endc--;

            if (startr <= endr) { // Ensure there are rows left for bottom traversal
                // Bottom row
                for (int j = endc; j >= startc; j--) {
                    System.out.print(arr[endr][j] + " ");
                }
                endr--;
            }

            if (startc <= endc) { // Ensure there are columns left for left traversal
                // Left column
                for (int i = endr; i >= startr; i--) {
                    System.out.print(arr[i][startc] + " ");
                }
                startc++;
            }
        }
        System.out.println();
    }

    public static void display(int arr[][]) {
        int r=4;
        int c=4;
        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr[0].length ; j++) {

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

        spiral(arr);
        System.out.println();
        display(arr);
    }
}

















/*
package _26_2_2dArrays;

public class Spiral_matrix {

    public static void spiral(int arr[][])
    {
        int n=arr.length;
        int rows=arr.length;
        int cols=arr[0].length;
       int startr=0;
       int endr=n-1;
       int startc=0;
       int endc=cols-1;

       while (startr<=endr && startc<=endc)
       {
           //Top row
           for (int j = startc; j <=endc ; j++) {
               System.out.print(arr[startr][j]+" ");
           }

           //Right column
           for (int i = startr+1; i <=endr ; i++) {
               System.out.print(arr[i][endc]+" ");
           }

           //Bottom row
           for (int j = endc; j >=startc+10 ; j++) {
               System.out.print(arr[endr][j]+" ");
           }

           //Left column
           for (int i = endr-1; i >=startr+1 ; i++) {
               System.out.print(arr[i][startc]+" ");
           }

           startr++;
           endr--;
           startc++;
           endc--;
       }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                {13,14,15,16}};

        spiral(arr);
    }
}
*/
