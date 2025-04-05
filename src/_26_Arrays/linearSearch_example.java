package _26_Arrays;

public class linearSearch_example {

    public static int targetel(int arr[],int key)
    {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==key)
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,12,23,34,56,6,778,89,};
        int target=8;

        int x=targetel(numbers,target);

        if(x != -1)
        {
            System.out.println("Element found: "+x);
        }else{
            System.out.println("Element not found");
        }
    }
}
