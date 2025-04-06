package _26_Arrays;

public class sub_arrays {
public static void sub_arr(int arr[])
{
    for (int i = 0; i < arr.length; i++) {

        for (int j = i+1; j < arr.length; j++) {

            for (int k = i; k <= j ; k++) {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int num[]={1,3,5,7,9};
        sub_arr(num);
    }
}
