package _26_Arrays;

public class Elements_repeatancy {

    public static boolean check_repeatancy(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j = i+1; j <arr.length ; j++) {

                if (arr[i] == arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[]={1,2,3,42,4,5,2};
        boolean x=check_repeatancy(num);
        System.out.println(x);

    }
}
