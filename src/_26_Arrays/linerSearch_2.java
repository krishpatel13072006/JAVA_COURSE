package _26_Arrays;

public class linerSearch_2 {

    public static String menu(String arr[],String key)
    {

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==key)
            {
                return arr[i];
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        String items[]={"dosa","idli","vadapav","mendu wada"};
        String key="idli";

        String x=menu(items,key);

        if(x != "-1")
        {
            System.out.println("item Found: "+x);;
        }
        else{
            System.out.println("item not found!!");
        }
    }
}
