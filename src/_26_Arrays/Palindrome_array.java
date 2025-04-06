package _26_Arrays;

public class Palindrome_array {

    public static boolean reverse(int arr[])
    {
        int start=0;
        int last=arr.length-1;

        for (int i = 0; i < arr.length/2; i++) {

            if (arr[start] != arr[last])
            {
                return false;
            }
            else
            {
                start++;
                last--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numbers[]={12,23,23,12};

        boolean x=reverse(numbers);
        System.out.println(x);
    }
}
