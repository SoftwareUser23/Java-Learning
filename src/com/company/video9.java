package com.company;
// Associativity of Operators in Java
public class video9 {
    public static void main(String[] args) {

        // Precedence and associativity
        int First = 3*6-34/2;
       /* =18-34/2
        =18-17
        =1
       */
        System.out.println(First);
        int Second = 20/2-32*4;
        /*
        =10-128
        =-118
         */
        System.out.println(Second);

        // Quiz -
        int x = 10;
        int y = 10;
        int QuizQ1 = x-y/2;

        System.out.println(QuizQ1);
        int b = 4;
        int a = 2;
        int c = 6;
        int FirstEq = b*b;
        int QuizQ2 = (FirstEq) - 4*a*c /(2*a);
        System.out.println(QuizQ2);

    }

}
