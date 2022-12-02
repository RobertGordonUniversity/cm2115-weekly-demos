package uk.ac.rgu.topic9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class App {
    
    public static void main(String[] args) {
        
        /* Use the File class to create a new file */
        File file = new File("myfile.txt");

        /* Try to create the file: returns true if sucessful, false if the file exists
         * Throws an exception on error
         */
        try{
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        /* Try to write to a new file using try-with-resources */
        try(FileWriter fw = new FileWriter("anotherfile.txt", true); BufferedWriter bw = new BufferedWriter(fw) ){
            bw.write("This is a message\n");
            bw.write("This is another message\n");

            bw.close();
            fw.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
