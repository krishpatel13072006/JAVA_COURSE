package _9_ObjectClass_Methods;

public class Equals_method {

     int age;
     String name;
   Float marks;

   // in terms of string class equals method checks whether the content of both objects are same on not
    //return ture if content are same
   String s1=new String("hello");
   String s2=new String("hello");

    Equals_method(int age,String name,Float marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
    }


    @Override
    public boolean equals(Object obj) {
        //checks whether current class object and obj belongs to same memory location or not
        if(this==obj)
        {
            return true;
        }
        //cheks whether obj is null or has null value
        if(obj==null)
        {
            return false;
        }
        //check if obj belongs to getClass() or not
        if(getClass() != obj.getClass())
        {
            return false;
        }
        //type cast obj to Equals_method object
        Equals_method obj1=(Equals_method) obj;

        //checks fields and return true if fields are match
        return age == obj1.age &&
                marks.equals(obj1.marks);
    }

    public static void main(String[] args) {
        Equals_method t1=new Equals_method(19,"krish patel", 90.00f);
        Equals_method t2=new Equals_method(19,"krish patel", 90.00f);

        System.out.println(t1.s1.equals(t1.s2));

        boolean x=t1.equals(t2);
        System.out.println(x);
    }
}

/*
equals() Method:

Reference Check: if (this == obj) returns true if both references point to the same object.

Null Check: if (obj == null) returns false if the object is null.

Class Check: if (getClass() != obj.getClass()) returns false if the object is not of the same class.

Type Casting: Equals_method obj1 = (Equals_method) obj casts the object to the current class.

Field Comparison: Compares age, name, and marks fields and returns true if they match*/
