package uz.bepro.jsonBuffer;

import java.io.*;

public class BuferSample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("folder/utilOxford/scratch.json"))){
            String line;
            while ((line =bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("folder/readme.txt");
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            String s = new String(bytes);
            System.out.println(s);
            System.out.println("---------bytes------------");
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(bytes[i]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
