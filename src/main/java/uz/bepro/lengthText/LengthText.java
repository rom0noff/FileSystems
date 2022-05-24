package uz.bepro.lengthText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LengthText {
    public static void main(String[] args) {
        lengthMethod("folder/util/readme3.txt");
    }

    public static void lengthMethod(String pathName){
        Scanner scanner = null;
        File file = new File(pathName);
        try{
            scanner = new Scanner(new File(pathName));
            int num = 0;
            while (scanner.hasNext()){
                String str = scanner.nextLine();
                String [] st1 = str.split(" ");
                int [] sum = new int[st1.length+1];
                for (int j = 0; j < str.length()+1; j++) {
                    for (int i = 0; i < st1.length; i++) {
                         sum[j] += st1[i].length();
                    }
                    System.out.println(sum[j]);
                }

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
