package _25_Stirngs;

public class printAllSubstring {

    public static void main(String[] args) {

        String s="abcd";

//        System.out.println(s.length());

        for (int i = 0; i <=3 ; i++) {

            for (int j = i+1; j <=s.length() ; j++) {
                System.out.println(s.substring(i,j));
            }

        }
    }
}
