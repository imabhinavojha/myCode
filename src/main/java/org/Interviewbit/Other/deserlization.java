package org.Interviewbit.Other;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserlization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("fileobj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            student obj = (student) ois.readObject();
            obj.name();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }

    }

}
