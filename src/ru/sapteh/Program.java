package ru.sapteh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) throws IOException {

        Dog dog = new Dog("Morning", 5,20,"Jack");
        Kat kat = new Kat("Ball", 3,7,"Mike");
        Bird bird = new Bird("Summer",10,1,"Franklin");

        try{
            FileOutputStream fos = new FileOutputStream("Person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dog);
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
