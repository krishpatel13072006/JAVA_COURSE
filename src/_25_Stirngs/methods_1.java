package _25_Stirngs;

public class methods_1 {

    public static void main(String[] args) {

        //length
        String s="welcome";
        String n="welcome";
        System.out.println(s.length());

        //charAt()
        System.out.println(s.charAt(2));

        //toLowerCase()
        System.out.println(s.toLowerCase());

        //toUpperCase()
        System.out.println(s.toUpperCase());

        //getBytes()
        System.out.println(s.getBytes());


        //indexOf
        System.out.println(s.indexOf("c"));

        //compareTo
        System.out.println(s.compareTo(n));

        //contains
        System.out.println(s.contains("come"));

        //startsWith()
        System.out.println(s.startsWith("we"));

        //endsWith()
        System.out.println(s.endsWith("me"));

        //concat();
        System.out.println(s.toUpperCase().concat(" nice to see you").toLowerCase());

        //substring(i,j);
        System.out.println(s.substring(0, 4));

        //substring(i);
        System.out.println(s.substring(1));

        //subSequence(i,j);
        System.out.println(s.subSequence(0,4));


    }
}
