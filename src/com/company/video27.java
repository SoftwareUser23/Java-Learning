package com.company;
// For Each Loop in Java

public class video27 {
    public static void main(String[] args) {
        // int array
        int [] marks = {2,3,4,8,3};
        System.out.println(marks.length);
        // Floating point array
        float [] marks2 = {32.5f,3.10f,4.32f,8.4f,3.45f};
        System.out.println(marks2.length);
        // String point array
        String [] marks3 = {"3","4","432"};
        System.out.println(marks3.length);
        System.out.println("End");
        System.out.println("\n");
        System.out.println("Printing using for loop");
        int [] array = {44,84,27,82,90,19,30};
        //  Printing an array
        for (int a=0;a<array.length;a++) {
            System.out.println(array[a]); // Traversal  Array;
        }
        // Array print {n(length of array)-1}
        System.out.println("\n");
        System.out.println("Printing Array in Reverse Order");
        int [] array2 = {44,84,27,82,90,19,30,89,3};
        for (int b=array2.length -1;b>=0;b--){
            System.out.println(array2[b]);
        }
        System.out.println("Printing array using for each loop");
        int [] array3 = {44,84,27,82,90,19,30,89,3};
        for (int printArray: array3) {
            System.out.println(printArray);
        }

        






    }
}
