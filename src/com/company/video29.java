package com.company;
import java.util.Scanner;
// Practice Questions on Arrays in Java

public class video29 {
    public static void main(String[] args) {
        // Question 1 -
        float [] Q1Array = {3.3f,4.43f,5.4f,6.90f,4.5f};
        float Q1sum = 0;
        for (float Q1forE:Q1Array) {
            Q1sum = Q1sum+Q1forE;
        }
        System.out.println("Value is : "+Q1sum);
        System.out.println("Question1 end");
        // Question 2 -
        System.out.println("Enter the value ");
        Scanner Q2GetInt = new Scanner(System.in);
        int [] Q2Array = {3,4,5,6,7};
        int Q2sum = Q2GetInt.nextInt(); // right inp -: 2 , 3 , 4 wrong inp -: 1, 8, 9, 2,
        boolean Q2PresentInArray = false;
        for (int Q2forE:Q2Array) { // For each loop
            if (Q2forE==Q2sum) {
                Q2PresentInArray = true;
                break;
            }
        }if (Q2PresentInArray) {
            System.out.println("Value  is Present");
        }else {
            System.out.println("Value is not present");
        }
        System.out.println("Question2 end");
        // Question 3 -
        float [] Q3Array = {35.7f, 66.58f, 43.4f, 93.2f, 100.0f};
        float Q3sum = 0;
        for(float Q3forE:Q3Array){
            Q3sum = Q3sum + Q3forE;
        }
        float printAvg = Q3sum/Q3Array.length;
        System.out.println("The value of average marks is " + printAvg);
        System.out.println("Question3 end");
        // Question 4 -
       int [][] Q4Array = {{1,2,3}, // 2d array
                           {4,5,6}};
       int [][] Q4Array1 = {{2,6,13},
                            {3,7,1}};
       int [][] Q4Result = {{0,0,0},
                            {0,0,0}};
       // displaying the elements of a 2d array
       for (int forL1=0;forL1<Q4Array.length;forL1++) { // row n
           for (int forL2=0;forL2<Q4Array[forL1].length;forL2++){ // columns
               System.out.format("Value for forL1=%d and forL2=%d\n",forL1,forL2);
               Q4Result[forL1][forL2] = Q4Array[forL1][forL2] + Q4Array1[forL1][forL2];
           }
       }
        for (int forL1=0;forL1<Q4Array.length;forL1++) {
            for (int forL2=0;forL2<Q4Array1[forL1].length;forL2++){
                System.out.print(Q4Result[forL1][forL2]+ " ");
               Q4Result[forL1][forL2] = Q4Array[forL1][forL2] + Q4Array1[forL1][forL2];
            }
            System.out.println(""); //newLine
        }
        System.out.println("Question4 end");
        // Question 5 -
        int [] Q5Array = {1,2,3,4,5,6,7,8};
        int Q5arrlen = Q5Array.length;
        int Q5Temp;
        int Q5Math = Math.floorDiv(Q5arrlen,2);
        for (int Q5forl=0;Q5forl<Q5Math;Q5forl++){
            Q5Temp = Q5Array[Q5forl];
            Q5Array[Q5forl] = Q5Array[Q5arrlen-Q5forl-1];
            Q5Array[Q5arrlen-Q5forl-1] = Q5Temp;

        }
        for (int Q5element:Q5Array) {
            System.out.printf("%d\n",Q5element);
        }
        System.out.println("Question5 end");
        // Question 6 -
        // Maximum Element number in Array
        int [] Q6Array = {1,2,3,4,5,6,7,22,18};
        int Q6MaxValue = 0 ;
        for (int Q6forl:Q6Array) {
            if (Q6forl>Q6MaxValue){
                Q6MaxValue = Q6forl;
            }
        }
        
        System.out.printf("Maximum Element value is %d\n",Q6MaxValue);
        System.out.println("Question6 end");
        // Question 7 -
        // Minimum element  number in Array
        int [] Q7Array = {1,2,3,4,5,6,7,8};
        int Q7MinValue = Integer.MAX_VALUE;
        for (int Q7forl:Q7Array) {
            if (Q7forl<Q7MinValue) {
                Q7MinValue = Q7forl;
            }
        }
        System.out.println(Q7MinValue);
        System.out.println("Question7 end");
        // Question 8 -
        // finding array is sorted or not
        int[] Q8Array = {1,12,233,14,54,6,7,844,24,};
     // int[] Q8Array = {1,2,3,4,5,6,7,8,24,};
        boolean Q8IsSorted = true;
        for (int Q8forl=0;Q8Array.length-1>Q8forl;Q8forl++) {
            if (Q8Array[Q8forl] > Q8Array[Q8forl+1]) {
                Q8IsSorted = false;
                break;
            }
        }
        if (Q8IsSorted) {
            System.out.println("Array is Sorted");
        }else {
            System.out.println("Array is not Sorted");
        }
        System.out.println("Question8 end");






    }
}
