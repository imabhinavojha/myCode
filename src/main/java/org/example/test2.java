package org.Interviewbit.Other;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test2 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);

        Path path = FileSystems.getDefault().getPath("fileobj.txt").toAbsolutePath();;
        System.out.println(path);

        String myCurrentDir = System.getProperty("user.dir")
                + File.separator
                + System.getProperty("sun.java.command")
                .substring(0, System.getProperty("sun.java.command").lastIndexOf("."))
                .replace(".", File.separator);
        System.out.println(myCurrentDir);



    }
    
}
