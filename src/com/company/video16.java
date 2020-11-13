package com.company;
import java.util.Scanner;

// If-else Statement in Java
public class video16 {
    public static void main(String[] args) {
        Scanner SmokeIfE = new Scanner(System.in);
        System.out.println("Enter you'r age : ");
        int AgeInp = SmokeIfE.nextInt();
//        if(AgeInp<18) {
//            System.out.println("You cannot smoke boy!");
//        }
//        if(AgeInp!=18) {
//            System.out.println("You can smoke boy!");
//        }
        boolean con = (AgeInp==18);
        if(con) {
            System.out.println("You can smoke boy!");
        }

        else {
            System.out.println("Yes you cannot smoke!");
        }






    }
}
