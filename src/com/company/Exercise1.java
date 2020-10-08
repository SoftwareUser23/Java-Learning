package com.company;
import java.util.Scanner;


public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("CBSE board percentage calculator : \n");
        Scanner In1 = new Scanner(System.in);
       // Main code  - -
        {
            System.out.println("Enter first subject marks ");
            int First = In1.nextInt();
            System.out.println("Enter Second subject marks ");
            int second = In1.nextInt();
            System.out.println("Enter third subject marks ");
            int third = In1.nextInt();
            System.out.println("Enter fourth subject marks ");
            int fourth = In1.nextInt();
            System.out.println("Enter fifth subject marks ");
            int Fifth = In1.nextInt();
            int TotalMarks = First+second+third+fourth+Fifth;
            System.out.println(TotalMarks);
            float percentage = (TotalMarks/500.0f*100);
            System.out.println(percentage);
        }

    }
}
