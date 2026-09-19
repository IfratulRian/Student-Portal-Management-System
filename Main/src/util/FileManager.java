package util;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public static void write(String fileName, ArrayList<String> data){
        try{
            File file = new File(fileName);
            if(file.getParentFile() != null){
                file.getParentFile().mkdirs();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String line : data){
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("Data saved to: " + file.getAbsolutePath());
        }
        catch(IOException e){
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
    public static ArrayList<String> read(String fileName){
        ArrayList<String> data = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                data.add(line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
        return data;
    }
}