package com.company;
import java.util.Scanner;
//  Switch Case Statements in Java
public class video18 {
    public static void main(String[] args) {
        int FirstSCS = 67;
        if (FirstSCS>50) {
            System.out.println("YEAH BOI!!!");
        }
        else if (FirstSCS<80){
            System.out.println("COOL!!! ;) ");
        }
        else if (FirstSCS>10) {
            System.out.println("NAH");
        }
        else {
            System.out.println("LEAVE!!!!!!!!");
        }
        int SecondSS ;
        System.out.println("Enter you'r age");
        Scanner FirstSS = new Scanner(System.in);
        SecondSS = FirstSS.nextInt();
        switch (SecondSS){
            case 18:
                System.out.println("You'r adult\n");
                break;
            case 23:
                System.out.println("You'r looking for job\n");
                break;
            case 15:
                System.out.println("You'r Teenager\n");
                break;
            default:
                System.out.println("My age programme\n");
//                System.out.println("age\n");

        }

    }
}
