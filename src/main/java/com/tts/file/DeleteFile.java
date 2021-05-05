package com.tts.file;

import java.io.File;  // Import the File class

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("file2.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

//    Delete a Folder
//  You can also delete a folder. However, it must be empty:
//import java.io.File;
//
//public class DeleteFolder {
//    public static void main(String[] args) {
//        File myObj = new File("C:\\Users\\MyName\\Test");
//        if (myObj.delete()) {
//            System.out.println("Deleted the folder: " + myObj.getName());
//        } else {
//            System.out.println("Failed to delete the folder.");
//        }
//    }
//}
