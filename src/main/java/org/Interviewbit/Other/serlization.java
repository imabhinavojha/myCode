package org.Interviewbit.Other;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serlization {
    public static void main(String[] args) {
        try {
            student obj = new student("Abhinav", "abhi@gmail", "noida", 28);
            FileOutputStream fos = new FileOutputStream("fileobj.txt");
            ObjectOutputStream ops = new ObjectOutputStream(fos);
            ops.writeObject(obj);
            ops.close();
            fos.close();
            System.out.println("Object state has been trafer");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }

    }

}
