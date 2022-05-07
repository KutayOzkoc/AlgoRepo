package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
    public static int rowCounter;
    public static int colCounter;
    public void readFileLine(){
        try {
            File myObj = new File("src/sources/map_one.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                rowCounter++;
                colCounter = data.length();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public HashMap readFileWord(){
        HashMap<Integer,String> list = new HashMap<Integer, String>();
        int i = 0;
        String data = "";
        try {
            File myObj = new File("src/sources/map_one.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNext()) {
                data = myReader.next();
                list.put(i,data);
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list;
    }

}
