public class Reverse_array_2 {

    public static void reverse(int arr[])
    {
        int first=0;
        int last=arr.length-1;

        while(first<last)
        {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {

        int number[]={1,2,3,4,5,6,7,8,9,10};

        reverse(number);
        for (int i = 0; i <number.length ; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
