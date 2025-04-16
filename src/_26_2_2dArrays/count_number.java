package _26_2_2dArrays;

import java.util.Scanner;

public class count_number {

    public static void count(int arr[][],int count_num)
    {
        int count=0;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[0].length ; j++) {

                if (arr[i][j]==count_num){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                 arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("enter your number to count its presence: ");
        int count_n= sc.nextInt();

        count(arr,count_n);
    }
}
