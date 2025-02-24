package _15_final_kyeword;

 public final class final_class {
      final String name;

      static final String college="AIET COLLEGE";

      static  final int age;

      final_class()
      {
          name="krish patel";//we can only initialise final blank variables in constructor
          System.out.println(name);
      }

      static{
          age=19;//static final blank variable can only be initialised in static block
          System.out.println(age);
      }

      public static final void hello(){
          System.out.println("Final method can be accessed in another class but can not be overridden in another class");
      }

     public static void main(String[] args) {
         final_class x1=new final_class();
         final_class.hello();
     }

}
