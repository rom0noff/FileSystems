package uz.bepro.textFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) {
        textMethod("folder/util/readme3.txt");
    }

    public static void textMethod(String pathName) {
        File file = new File(pathName);
        Scanner scanner = null;
        int i=1;
        try {
            if (file.exists()) {
                scanner = new Scanner(new File(pathName));
                while (scanner.hasNext()){
                    System.out.println(i + " : " + scanner.nextLine());
                    i++;
                }
                System.out.println("Qator soni : " + (i-1));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
