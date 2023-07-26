package org.fbreshbyte;

import javax.swing.border.TitledBorder;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Measurable {
    public static final String TITLE = "- =Measurable Application = -";
    public static final String METER = "m";
    public static final String CENTIMETER = "cm";
    public static final String INCH = "in";
    public static final String FOOT = "ft";

    public static void main(String[] args) {
        System.out.println(TITLE);
        Scanner input = new Scanner(System.in);
        System.out.println("What International scale unit you prefer");
        String unit = input.nextLine();
        System.out.println("You have chosen :" + unit + "system");

        System.out.print("What is the side of the square? : ");
        String s = input.next();


        Double aria = calculateAria(s);
        if (aria == null)
            return;


        System.out.println("The aria of the square is " + aria);


    }

    private static Double calculateAria(String s) {
        double size;
        try {
            size = Double.parseDouble(s);
        }
           catch (NumberFormatException e){
               System.out.println(" We can only measure using numbers. Letters are not allowed");
               return null;
           }
        if(size < 0) {
            System.out.println("We can't calculate area of a negative number");
            return null;
        }
        double aria = size * size;
        return aria;
    }
}

//-> Measure the area of a square
//-> Measure the area of a circle
//-> Measure the Volume of a cube
