/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius or F to convert Celsius to Fahrenheit: ");
        String conversion = scan.nextLine();
        System.out.print("What is the temperature? ");
        String temperature = scan.nextLine();

        double temper = Double.parseDouble(temperature);
        double convertedTemp;
        if (conversion.toLowerCase().equals("c")) {
            convertedTemp = (temper - 32) * 5 / 9;
            System.out.println(String.format("The temperature in Celsius is %.1f", convertedTemp));
        } else if (conversion.toLowerCase().equals("f")) {
            convertedTemp = (temper * 9 / 5) + 32;
            System.out.println(String.format("The temperature in Fahrenheit is %.1f", convertedTemp));
        }
    }
}