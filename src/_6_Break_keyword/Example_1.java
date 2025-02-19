package _6_Break_keyword;

public class Example_1 {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int num=3;

        for (int i = 0; i <array.length ; i++) {

            if(array[i]==num)
            {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
