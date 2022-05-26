package uz.bepro.lenghtLetter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LetterLenght {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qaysi harfni izlashni hohlaysiz...");
        String search = scanner.nextLine().toLowerCase();
        letterMethod(search);
    }

    public static void letterMethod(String search){
        int sum =0;
        try {
            Scanner scanner1 = new Scanner(new File("folder/readme.txt"));
            while (scanner1.hasNext()){
                String [] demo = scanner1.nextLine().toLowerCase().split("");
                for (int i = 0; i < demo.length; i++){
                    if(search.contains(demo[i])){
                        sum++;
                    }
                }
            }
            System.out.println("Siz izlagan harflar soni :  " + sum);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
