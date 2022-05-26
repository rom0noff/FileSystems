package uz.bepro.twoTextFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TwoTextFile {
    public static void main(String[] args) {
        String st1 = "";
        String st2 = "";
        try {
            Scanner scanner1 = new Scanner(new File("folder/util/readme3.txt"));
            Scanner scanner2 = new Scanner(new File("folder/readme.txt"));
            while (scanner1.hasNext()){
                st1 += "\n" + scanner1.nextLine()+"\n";
            }
            System.out.println("=====================");
            while (scanner2.hasNext()){
                st2 += scanner2.nextLine()+"\n";
            }
            File file = new File("folder/readme1.txt");
            OutputStream outputStream = new FileOutputStream(file, true);
            outputStream.write((st1 + st2).getBytes(StandardCharsets.UTF_8));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
