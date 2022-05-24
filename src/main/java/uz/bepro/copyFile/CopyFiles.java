package uz.bepro.copyFile;

import java.io.File;
import java.io.IOException;
import java.sql.Array;

public class CopyFiles {
    public static void main(String[] args) {
        File file = new File("folder/util/readme3.txt");
        try {
            if (file.isFile()) {

                String [] demo = file.getName().split("\\.");
                demo[0] = demo[0]+"(copy)."+demo[1];
                File newFile = new File(file.getParent()+"/"+demo[0]);
                System.out.println(newFile.createNewFile());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
