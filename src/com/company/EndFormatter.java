package com.company;

import java.io.IOException;
import java.util.HashMap;

public class EndFormatter {
    public void formatMap() throws IOException {

        ProcessData processData = new ProcessData();
        HashMap<Integer, String> myMap = processData.processData();
        ReadFromFile readFromFile = new ReadFromFile();
        int k = 0;
        int ctr = 0;
        int mapSize = myMap.size()-2;
        for(int i = 0; i < mapSize; i++ ){
            if(myMap.get(i).equals("-1")){
                myMap.replace(i,"X");
            }
            if(myMap.get(i).equals("0")){
                myMap.replace(i,"W");
            }
        }
        for(int i = 0; i< mapSize;i++){
            if(i % (readFromFile.colCounter/2+1) == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(myMap.get(i) + " ");
        }
        System.out.println();
        System.out.println("*****************");
        System.out.println(myMap.get(myMap.size()-2) + " uzunluğunda bir dere akmaktadır. ");
        System.out.println(myMap.get(myMap.size()-1) + " farklı bölgemiz bulunmaktadır. ");
    }
}
