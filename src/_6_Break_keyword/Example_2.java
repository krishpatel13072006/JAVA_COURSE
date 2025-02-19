package _6_Break_keyword;

public class Example_2 {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++)
        {
            for (int j = 1; j <=3 ; j++) {

                if(i==2 && j==2)
                {
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
