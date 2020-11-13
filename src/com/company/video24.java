package com.company;
// Break and Continue in Java

public class video24 {
    public static void main(String[] args) {
        for (int a=0; a<10;a++){
            System.out.println("Break\t"+a);
            if (a==5){
                System.out.println("Ending the Loop\n");
                break;
            }
        }

        for (int b=0;b<6;b++){
            System.out.println("Continue\t"+b);
            if (b==3){
                System.out.println("Ending the Loop\n");
                continue;
            }
        }
        System.out.println("Do");
        int c=0;
        do {
            c++;
            if (c==2){
                continue;

            }
            System.out.println(c);
        }while (c>5);
        System.out.println("Loops are good");



    }
}
