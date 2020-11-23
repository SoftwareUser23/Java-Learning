package com.company;
import java.util.Scanner;

// Practice Questions on Loops
public class video25 {
    public static void main(String[] args) {
        // Question 1 -
        int Q1int = 4;
        for (int Q1Fint=Q1int; Q1Fint>0; Q1Fint--){
            for(int Q1F2int=0;Q1F2int<Q1Fint;Q1F2int++){
                System.out.print("*");

            }
            System.out.print("\n");
        }
        System.out.println("Question1 end\n");

        // Question 2 -

        int Q2int = 0;
        int Q2int2 =4;

        for (int Q2Fint=0;Q2Fint<Q2int2;Q2Fint++){
            // 2n = Even Numbers
            Q2int = (int)(Q2int + (2*Q2Fint));

        }
        System.out.println("Sum of first 4 even number is :" +Q2int);
        System.out.println("Question2 end\n");

        // Question 3 -

        int Q3int = 5;
        for (int Q3F1int=0;Q3F1int<=10;Q3F1int++){
            System.out.printf("%d x %d = %d\n",Q3int,Q3F1int,Q3int*Q3F1int);
        }
        System.out.println("Question3 end\n");

        // Question 4 -

        int Q4int = 5;
        for (int Q4F1int=10; Q4F1int>=1; Q4F1int--){
            System.out.printf("%d x %d = %d\n",Q4int,Q4F1int,Q4int*Q4F1int);
        }
        System.out.println("Question4 end\n");

        // Question 5 -

        int Q5int ;
        System.out.println("Enter the Number");
        Scanner GetFactNum = new Scanner(System.in);
        Q5int = GetFactNum.nextInt();
        long Q5factorial = 1;
        for(int Q5Fint1=1;Q5Fint1<=Q5int;++Q5Fint1) {

            
            Q5factorial = Q5factorial *Q5Fint1;
        }
        System.out.printf("Factorial of %d = %d", Q5int, Q5factorial);
        System.out.println("Question5 end\n");


        // Question 6 -

        int Q6int = 5;
        while (Q6int==5) {
            System.out.println(Q6int);
        }
        System.out.println("Question6 end\n");

        // Question 7 -
        int Q7int = 1;
        while (Q7int==1) {
            System.out.println(Q7int);
        }
        System.out.println("Question7 end");

        // Question 8 -

        // No code here

        // Question 9 -

        int Q9int = 8;
        int Q9int2 = 0;
        for (int Q9F1int=0;Q9F1int<=10;Q9F1int++){
          Q9int2 += Q9int * Q9F1int;
        }
        System.out.println(Q9int2);
        System.out.println("Question9 end\n");

        // Question 10 -

        // No code here

        // Question 11 -

        int Q11int = 2;
        while (Q11int==2) {
            System.out.println(Q11int);
        }
        System.out.println("Question11 end");

    }

}
