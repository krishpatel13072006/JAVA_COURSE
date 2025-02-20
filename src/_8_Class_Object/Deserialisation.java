package _8_Class_Object;

import java.io.*;

public class Deserialisation implements Serializable {

    String name;
    public Deserialisation(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Deserialisation t1=new Deserialisation("Krish Patel");

//        ObjectOutputStream ser =new ObjectOutputStream(new FileOutputStream("student.ser"));
//        ser.writeObject(t1);
//        ser.close();

ObjectInputStream dser=new ObjectInputStream(new FileInputStream("student.ser"));
Deserialisation obj=(Deserialisation)dser.readObject();
        System.out.println(obj.getName());
    }
}
