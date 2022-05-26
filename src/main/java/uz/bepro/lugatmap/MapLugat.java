package uz.bepro.lugatmap;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLugat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========LUG'AT=========");
        System.out.println("1. Uzbekcha -> Inglizcha");
        System.out.println("2. English -> Uzbek");
        switch (scanner.nextInt()){
            case 1 : {
                System.out.println("Izlash...");
                String serach = scanner.nextLine();
                english(serach);
                break;
            }
            case 2 : {

                break;
            }
            default:
                System.err.println("error.");
        }
    }

     public static void english(String search){
        Map<String, String> list = new LinkedHashMap<>();
     }
}
