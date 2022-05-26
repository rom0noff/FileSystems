package uz.bepro.searchFolderFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FolderClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Izlang ... ");
        String serachText = scanner.nextLine().toLowerCase();
        folderMethod("/Users/", serachText);

    }

    public static void folderMethod(String pathName, String serachText) {

        File file = new File(pathName);
        if (file.exists()) {

            File[] folder = file.listFiles();
            try {
            for (int i = 0; i < folder.length; i++) {

                    if (folder[i].getName().contains(serachText)) {
                        System.out.println("YES : " + folder[i].getAbsolutePath());
                    }
                    if (folder[i].isDirectory()) {
                        folderMethod(folder[i].getAbsolutePath(), serachText);
                    }
                }
            }
            catch (Exception e){
                return;
            }
        } else {
            System.out.println("Siz izlayotgan file yoki papka yo'q .");
        }
    }
}
