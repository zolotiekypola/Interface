package ru.sapteh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Program1 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Dog dog = (Dog) ois.readObject();

            System.out.println(dog.toString());
        } catch (IOException e){
            e.getStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
