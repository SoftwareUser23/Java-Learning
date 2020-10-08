package com.company;
import java.util.Scanner;

public class video7 {
    public static void main(String[] args) {
        // Question 1 -
        System.out.print("Question First  : \n");
        int FirstNumber = 35;
        int SecondNumber = 87;
        int ThirdNumber = 48;
        int SumOfThreeNumbers = FirstNumber + SecondNumber + ThirdNumber;
        System.out.println(SumOfThreeNumbers);

        // Question 2 -
        System.out.println("Question Second : ");
        float SubOne = 38;
        float SubTwo = 82;
        float SubThree = 67;
        float SubFour = 90;
        float SubFive = 78;
        float TotalCgpa = (SubOne+SubTwo+SubThree+SubFour+SubFive)/50;
        System.out.println(TotalCgpa);

        // Question 3 -
        System.out.println("Enter you're Name : ");
        Scanner Hello =  new Scanner(System.in);
        String Name = Hello.next();
        System.out.println("Hello " + Name + " Have a good day!\n");

        // Question 4 -

        System.out.println("Kilometer to miles converter\n");
        Scanner KmToMile = new Scanner(System.in);
        System.out.println("Enter KiloMeters Value : ");
        float KiloMeter = KmToMile.nextInt();
        float FinalMiles = (KiloMeter);
        System.out.println(FinalMiles /1.609344F + " Miles" + "\n");

        // Question 5 -
        System.out.println("Enter number to check it's integer or not : ");
        Scanner IntChecker = new Scanner(System.in);
        System.out.println(IntChecker.hasNextInt());






    }
}
