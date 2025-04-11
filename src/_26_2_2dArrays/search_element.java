package _26_2_2dArrays;

import java.util.Scanner;

public class search_element {

    public static void search(int arr[][],int key)
    {
        int large=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[0].length ; j++) {

                if(arr[i][j]==key)
                {
                    System.out.print(i+" "+j);
                    break;
                }
                if(large<arr[i][j])
                {
                    large=arr[i][j];
                }

            }
            System.out.println();
        }
        System.out.println(large);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[3][2];
        int rows=3;
        int cols=2;

        for (int i = 0; i <rows ; i++) {

            for (int j = 0; j <cols ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter key to search");
        int key=sc.nextInt();
        search(arr, key);
    }

}
