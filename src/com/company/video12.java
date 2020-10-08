package com.company;

import java.util.Scanner;

// practice set 2
public class video12{
    public static void main(String[] args) {
        // Question 1
        float Que1 = 7/4 * 9/2;
        float Que1R = 7/4.0f * 9/2.0f;
        System.out.println(Que1);
        System.out.println(Que1R);
        // Question 2
         char Que2Grade = 'C';
         Que2Grade = (char)(Que2Grade+8);
         System.out.println(Que2Grade);
         // Decrypting code -
         Que2Grade = (char)(Que2Grade - 8);
         System.out.println("End " +Que2Grade);
         // Question 3 -
        Scanner Que3InpFromUser = new Scanner(System.in);
        System.out.println("Enter marks");
        int Que3Marks = Que3InpFromUser.nextInt();
        int Que3Val = 8;
        System.out.println(Que3Marks>8);
        System.out.println("End Question3 \n");
        // Question 4 -
        Scanner Que4 = new Scanner(System.in);
        System.out.println("Enter Value of V");
        float v = Que4.nextFloat();
        System.out.println("Enter Value of U");
        float u = Que4.nextFloat();
        System.out.println("Enter Value of A");
        float a = Que4.nextFloat();
        System.out.println("Enter Value of S");
        float s = Que4.nextFloat();
        float Que4Formula = (v*v-u*u)/(2*a*s);
        System.out.println("End Question foruth answer -: "+Que4Formula);

        // Question 5
        float Que5Val =7*49/7.0f + 35/7.0f;
        System.out.println(Que5Val);







    }
}
