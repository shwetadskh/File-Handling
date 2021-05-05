package com.tts.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("newFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " +myObj.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (Exception e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
