package com.company;
import java.util.Scanner;

//  Introduction to Strings
public class video13 {
        public static void main(String[] args) {
        String FirstStr = "Java is good\n";
        System.out.println("-: "+ FirstStr);

        int FirstInt = 9;
        float FirstFloat = 8.49273f;

        System.out.printf("Value of int is %d and value of float is %f\n", FirstInt, FirstFloat);
        System.out.format("Value of int is %d and value of float is %f\n", FirstInt, FirstFloat);
        System.out.format("Value of int is %d and value of float is %.3f\n", FirstInt, FirstFloat);
        System.out.format("Value of int is %d and value of float is %5.3f\n", FirstInt, FirstFloat);

        Scanner StrScannerFirst = new Scanner(System.in);
        String StrInpTypeStr = StrScannerFirst.nextLine();
        System.out.println(StrInpTypeStr);


    }
}
