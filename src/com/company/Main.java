package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    ReadFromFile readFromFile = new ReadFromFile();
        ProcessData processData = new ProcessData();
        System.out.println(" --- MAP BEFORE PROCESS --- ");
        readFromFile.readFileLine();
        processData.processData();
        System.out.println(" --- MAP AFTER PROCESS --- ");
        EndFormatter endFormatter = new EndFormatter();
        endFormatter.formatMap();
    }
}
