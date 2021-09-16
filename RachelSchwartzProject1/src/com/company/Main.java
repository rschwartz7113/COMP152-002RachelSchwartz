package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
	    var software = new ArrayList<String>();
        var price = new ArrayList<Float>();
        var avaliable = new ArrayList<Integer>();
        var commandLineReader = new Scanner(System.in);
        var fileName = "SoftwareAvalibility.txt";
        var filePath = (Paths.get(fileName));
        var allLines = Files.readAllLines(filePath);
        for(var line: allLines){
            var splitLine = line.split(",");
            software.add(splitLine[0]);
            price.add(Float.parseFloat(splitLine[1]));
            avaliable.add(Integer.parseInt(splitLine[2]));
        }
        System.out.print("What kind of software are you looking for?");
        var userInput1 = software;
        var userInput2 = price;
        var userInput3 = avaliable;
        while(true){
            if(!(userInput1 == software)) {
                System.out.println("This software is avaliable! Would you like to know the price of avalibility?");
                break;
            }
            else{
                System.out.println("Sorry, this software is unavaliable.");
                System.out.println("Try again");
                break;
                }

            }
        }


}

