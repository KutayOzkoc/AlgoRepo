package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessData {

    public HashMap<Integer, String> processData(){
        ReadFromFile readFromFile = new ReadFromFile();
        HashMap<Integer,String> liste = readFromFile.readFileWord();
        int counter = 0;
        Map.Entry<Integer, String> maxEntry = null;



        for(int i = 0; i < liste.size();i++){
            liste.get(i);
            if(liste.get(i).equals("3")){
                liste.replace(i,"-1");
            }
            if (liste.get(i).equals("S")) {
                liste.replace(i,"0");
                counter++;
            }
        }
        for (Map.Entry<Integer, String> entry : liste.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        liste.put(liste.size(),Integer.toString(counter));
        liste.put(liste.size(),maxEntry.getValue());

        return liste;
    }
}
