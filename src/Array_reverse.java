import java.util.Scanner;

public class Array_reverse {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        int x=arr.length-1;
        for(int i=x;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
