package _27_Soritng_algorithms;

import java.util.Scanner;

public class _2darray_search {

    public static void search(int arr[][],int key)
    {
        int smallest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[0].length ; j++) {

                if (arr[i][j]==key)
                {
                    System.out.println(i+" "+j);
                    break;
                }

                if (smallest<arr[i][j])
                {
                    smallest=arr[i][j];
                }
            }

        }
        System.out.print(smallest);

    }


    public static void display(int arr[][])
    {
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length ; j++) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int rows=3;
        int cols=3;
        for (int i = 0; i <rows ; i++) {

            for (int j = 0; j <cols ; j++) {

                arr[i][j]=sc.nextInt();
            }
        }

        display(arr);
        System.out.println("Enter key to search");
        int key=sc.nextInt();
        search(arr,key);

    }
}