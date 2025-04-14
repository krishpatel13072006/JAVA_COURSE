package _27_Soritng_algorithms;

public class insertionsort_2 {

    public static void sort(int arr[])
    {
        int n=arr.length;

        for (int i = 1; i <n ; i++) {

            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]<=key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[]={1,4,5,7,8,9,6,2,3};
        sort(arr);
        display(arr);
    }
}
