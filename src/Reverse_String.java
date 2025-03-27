import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();

        String rev="";
        char ch;

        for(int i=0;i<=s.length()-1;i++)
        {
            ch=s.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
