package _26_Arrays;

public class BinarySearch_1 {

    public static int targetelement(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;

        for (int i = 0; i <arr.length ; i++) {
            int mid=(low+high)/2;

            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int number[]={1,2,3,4,6,7,8,12,23,34,45,56,67,78,89};
        int target=45;

        int x=targetelement(number,target);

        if(x != -1)
        {
            System.out.println(x);
        }
        else{
            System.out.println("Not found!");
        }
    }
}
