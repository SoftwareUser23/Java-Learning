package com.company;
// Data Type of Expressions & Increment/Decrement Operators

public class video10 {
    public static void main(String[] args) {
        byte FirstByte = 10;
        int FirstInt = 3;
        short FirstShot = 8;
        int IntPlusShort = FirstInt+FirstShot;
        float FirstFloat = 5.6f + FirstByte;
        System.out.println(IntPlusShort);
        System.out.println(FirstFloat);

        // Increment and Decrement Operators
        System.out.println("Increments\n");
        int i = 45;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println("Decrements\n");
        int d = 46;

//        /#6f90ba    383747
        System.out.println(d);
        System.out.println(--d);
        System.out.println(d--);
        System.out.println(d);
        System.out.println(d--);
        System.out.println(--d);
        System.out.println("End\n");

        // Quick Quiz -
        //{in ++int number increases by 1 and in int++  number prints same value in this case  }
        int y = 6;
        int x = ++y *8;
        System.out.println(x);



    }
}
