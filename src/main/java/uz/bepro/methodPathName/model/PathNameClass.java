package uz.bepro.methodPathName.model;

import com.sun.glass.ui.Application;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class PathNameClass {
    public void method(String pathName) {

        File file = new File(pathName);
        String [] demo = file.getName().split("\\.");


        if(file.exists()){
            try {
                    if(demo[1].equals("txt")) {
                        System.out.println("Siz izlayotgan file : " + demo[0] + "." + demo[1]);

                    }
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Siz izlayotgan papka : " + demo[0]);
            }

        }else {

            try {
                if(demo[1].equals("txt")) {
                    System.out.println("Siz izlayotgan file yo'q ");

                }
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Siz izlayotgan papka yo'q ");
            }
        }
    }
}


