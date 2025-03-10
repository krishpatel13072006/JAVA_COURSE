package _24_Exception_handling;

import java.io.FileInputStream;
import java.io.IOException;

public class IO_Exception {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("abc.txt");

        } catch (IOException e) {
            System.out.println("file not found Exception has occurred ");
            System.out.println("hehheheh");
        }
    }
}
