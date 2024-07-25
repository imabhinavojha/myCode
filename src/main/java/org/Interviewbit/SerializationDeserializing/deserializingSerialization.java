package org.Interviewbit.SerializationDeserializing;
import org.Interviewbit.SerializationDeserializing.student;
import java.io.*;

public class deserializingSerialization {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String partialPath = "/src/main/java/org/Interviewbit/SerializationDeserializing/";
        deserializingSerialization obj = new deserializingSerialization();
        obj.serializationObjectFile(currentDir,partialPath);
        obj.deserializingObjectFile(currentDir,partialPath);
        obj.deleteObjectFile(currentDir,partialPath);

    }

    public void serializationObjectFile(String currentDir, String partialPath){
        try {
            student obj = new student("Abhinav", "abhi@gmail", "noida", 28);
            FileOutputStream fos = new FileOutputStream(currentDir+partialPath+"Serialized.txt");
            ObjectOutputStream ops = new ObjectOutputStream(fos);
            ops.writeObject(obj);
            ops.close();
            fos.close();
            System.out.println("Data has been Serialized \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void deserializingObjectFile(String currentDir, String partialPath){
        try {
            FileInputStream fis = new FileInputStream(currentDir + partialPath + "Serialized.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            student obj = (student) ois.readObject();
            obj.printDetails();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteObjectFile(String currentDir, String partialPath){
        try {
            File f_delete= new File(currentDir + partialPath + "Serialized.txt");
            if(f_delete.delete())
                System.out.println("Deletion Complete: "+f_delete.getName());
            else
                System.out.println("Failed!!!!!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
