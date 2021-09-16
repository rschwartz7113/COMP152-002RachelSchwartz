package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
	    var software = new ArrayList<String>();
        var price = new ArrayList<Float>();
        var avaliable = new ArrayList<Integer>();
        var fileName = "SoftwareAvalibility.txt";
        var filePath = (Paths.get(fileName));
        var allLines = Files.readAllLines(filePath);
        for(var line: allLines){
            var splitLine = line.split(",");
            software.add(splitLine[0]);
            price.add(Float.parseFloat(splitLine[1]));
            avaliable.add(Integer.parseInt(splitLine[2]));
        }


    }
}
