package uz.bepro.methodFile.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class FolderAndFile {

    public static void method(String pathName){
       File file = new File(pathName);
       if(file.exists()){
           File [] folder = file.listFiles();
           for (int i = 0; i < folder.length; i++) {
               if(file.isDirectory()){
                   System.out.println(folder[i].getName());
               }
           }

       }
    }
}
