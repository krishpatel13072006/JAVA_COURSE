public class half_pyramid_2 {

    public static void main(String[] args) {

        int n=5;
        //outer loop
        for (int i = 1; i <=n ; i++) {

            //inner loop-> print Spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //inner loop-> print star
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
