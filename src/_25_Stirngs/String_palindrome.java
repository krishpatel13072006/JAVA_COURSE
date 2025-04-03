package _25_Stirngs;

public class String_palindrome {

    public static boolean palindrome(String str)
    {
       int start=0;
       int last=str.length()-1;

       while(start<last)
       {
           if(str.charAt(start) != str.charAt(last))
           {
               return false;
           }
           start++;
           last--;
       }
       return true;
    }



    public static void main(String[] args) {


       boolean x= palindrome("dad");

        System.out.println(x);

    }
}
