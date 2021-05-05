package com.tts.file;

import java.io.FileWriter;

//In the following example, we use the FileWriter class together with its write() method
// to write some text to the file we created in the example above.
// Note that when you are done writing to the file, you should close it with the close() method:
public class WriteFile {

    public static void main(String[] args) {

        try{
            FileWriter myWriter =new FileWriter("newFile.txt");
            myWriter.write("File created in java is tricky but it is fun!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch(Exception e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }

    }
}
