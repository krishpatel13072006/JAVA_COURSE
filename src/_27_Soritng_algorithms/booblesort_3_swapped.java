package _27_Soritng_algorithms;

public class booblesort_3_swapped {

    public static void sort(int arr[]){
        boolean swap;

        int n=arr.length;

        for (int i = 0; i <n-1 ; i++) {

            swap=false;
            for (int j = i+1; j <n ; j++) {

                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        sort(nums);
//        display(nums);
    }
}
