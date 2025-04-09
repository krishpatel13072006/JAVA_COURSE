package _27_Soritng_algorithms;

public class bubblesort_2 {

    public static void sorting(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1- i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
     int nums[]={9,8,5,6,3,4,2,1,11,10,14,12,15,13};

     sorting(nums);
display(nums);
    }
}
