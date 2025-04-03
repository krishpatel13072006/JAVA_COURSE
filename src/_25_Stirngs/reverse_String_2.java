package _25_Stirngs;

import java.lang.StringBuilder;
public class reverse_String_2 {

    public static void reverse(String str)
    {
        StringBuilder rev=new StringBuilder(str);
        int n=rev.length();
        for (int i=0;i<=n/2;i++)
        {
            char firstchar=rev.charAt(i);
            char lastchar=rev.charAt(n-1-i);

            rev.setCharAt(i,lastchar);
            rev.setCharAt(n-1-i,firstchar);
        }

        System.out.println(rev.toString());
    }

    public static void main(String[] args) {

        reverse("hello");
    }
}
