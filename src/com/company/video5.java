package com.company;
//sout snippet for system.out.println

import java.util.Scanner;
// importing input module - import java.util.Scanner;

public class video5 {
    public static void main(String[] args) {
        System.out.println("Inputfrom user : ");
        Scanner In1 = new Scanner(System.in); // Object
        System.out.println("Enter value one : ");
        int I1 = In1.nextInt();
        System.out.println("Enter value two : ");
        int I2 = In1.nextInt();
        int SumOfTwo = I1+I2;
        System.out.println("Total");
        System.out.println(I1 + I2);
// New Code -
        System.out.println("INP");
        String StrInput = In1.next();
        System.out.println(StrInput);


    }

}
