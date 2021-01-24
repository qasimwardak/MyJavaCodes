package com.syntax.ReviewClass15;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileDemo {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\src\\com\\syntax\\ReviewClass15\\Test4.xlsx";
        File file=new File(path);
        Scanner scanner=new Scanner(file);

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        FileWriter fileWriter=new FileWriter(path);
        fileWriter.write("New line to my file");
        fileWriter.close();

    }
}
