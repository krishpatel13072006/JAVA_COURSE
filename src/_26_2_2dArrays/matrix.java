package _26_2_2dArrays;

import java.util.Scanner;

public class matrix {

    public static void display(int arr[][])
    {
        int n=3,m=3;
        for (int i = 0; i <n; i++) {

            for (int j = 0; j <m ; j++) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int n=3,m=3;
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <m ; j++) {

                arr[i][j]=sc.nextInt();
            }
        }

        display(arr);



    }
}
