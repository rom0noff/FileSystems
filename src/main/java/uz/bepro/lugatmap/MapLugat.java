package uz.bepro.lugatmap;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLugat {
    static Map<String, String> list = new HashMap<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========LUG'AT=========");
        System.out.println("1. Uzbekcha -> Inglizcha");
        System.out.println("2. English -> Uzbek");

        switch (scanner.nextInt()){
            case 1 : {
                System.out.println("Izlash... (uz->eng)");
                uzbek();
                break;
            }
            case 2 : {
                System.out.println("Search... (eng->uz)");

                english();
                break;
            }
            default:
                System.err.println("error.");
        }
    }


     public static void english(){
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        try {
            Scanner scanner1 = new Scanner(new File("folder/utilOxford/Oxford.txt"));

            while (scanner1.hasNext()){
//                list.clear();
                String[] user = scanner1.nextLine().split("-");
                list.put(user[0], user[1]);
            }
            System.out.println(list.get(search));
        }catch (Exception e){
            e.printStackTrace();
        }

     }

     public static void uzbek(){
         Scanner scanner = new Scanner(System.in);
         String search = scanner.nextLine();

         try {
             Scanner scanner1 = new Scanner(new File("folder/utilOxford/Oxford.txt"));
             while (scanner1.hasNext()){
                 String[] user = scanner1.nextLine().split("-");
                 list.put(user[1], user[0]);
             }
             System.out.println(list.get(search));
         }catch (Exception e){
             e.printStackTrace();
         }



     }
}
