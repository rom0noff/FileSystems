package uz.bepro.lengthText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LengthText {
    public static void main(String[] args) {
        lengthMethod("folder/readme.txt");
    }

    public static void lengthMethod(String pathName){
        Scanner scanner = null;
        File file = new File(pathName);
        try{
            scanner = new Scanner(new File(pathName));
            int max = 0;
            String text1 = "";
            while (scanner.hasNext()){
                String str = scanner.nextLine();
                String [] st1 = str.split(" ");
                int [] sum = new int[st1.length];
                for (int j = 0; j < 1; j++) {

                    for (int i = 0; i < st1.length; i++) {
                         sum[j] += st1[i].length();
                    }
                    if(max > sum[j]){

                    }else {
                        max = sum[j];
                        text1 = str;
                    }

                }
            }
            System.out.println("Eng uzuni : " + text1);
            System.out.println("Uzunligi : " + max);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
