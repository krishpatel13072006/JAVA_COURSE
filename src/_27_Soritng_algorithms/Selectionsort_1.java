package _27_Soritng_algorithms;

public class Selectionsort_1 {

    public static void sort(int arr[])
    {
        int n=arr.length;

        for (int i = 0; i <n-1 ; i++) {

            for (int j = i+1; j <n ; j++) {

                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void display(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int nums[]={9,8,5,6,3,4,2,1,11,10,14,12,15,13};
        sort(nums);
        display(nums);
    }
}
