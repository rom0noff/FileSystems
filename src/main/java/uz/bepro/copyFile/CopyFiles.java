package uz.bepro.copyFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.Scanner;

public class CopyFiles {
    public static void main(String[] args) {
        File file = new File("folder/util/readme3.txt");
        try {
            if (file.isFile()) {
                String [] demo = file.getName().split("\\.");
                demo[0] = demo[0]+"(copy)."+demo[1];
                File newFile = new File(file.getParent()+"/"+demo[0]);
                newFile.createNewFile();


                Scanner scanner = new Scanner(new File(file.getAbsolutePath()));
                while (scanner.hasNext()){
                    OutputStream outputStream = new FileOutputStream(newFile, true);
                    String text = scanner.nextLine()+"\n";
                    outputStream.write(text.getBytes(StandardCharsets.UTF_8));
                }
            }
            else if(file.isDirectory()){
                String [] fol = file.getPath().split("/");

                File folder = new File(fol[0]+"/"+fol[1]+"(copy)");
                folder.mkdirs();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
