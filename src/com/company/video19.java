package com.company;

// Practice Questions On Conditionals & Switch Case

import java.util.Scanner;
public class video19 {
    public static void main(String[] args) {
        // Question1 -
        int Question1 = 10;
       // wrong code identify
        // if (Question1=10){
//            System.out.println();
//        }
//        else {
//            System.out.println("");
//        }

        // Question2 -
        Scanner GetInputQ2 = new Scanner(System.in);

        // bytes to collect marks
        byte GetMarksEQ2,GetMarksMQ2,GetMarksSQ2;
        System.out.println("Enter your marks in English");
        GetMarksEQ2 = GetInputQ2.nextByte();
        System.out.println("Enter your marks in Maths");
        GetMarksMQ2 = GetInputQ2.nextByte();
        System.out.println("Enter your marks in Science");
        GetMarksSQ2 = GetInputQ2.nextByte();
        // dividing int with int == int , so using float and dividing it with 3.0
        float AverageMQ2 = (GetMarksEQ2+GetMarksMQ2+GetMarksSQ2)/3.0f;
        System.out.println("Your percentage is : \n" +AverageMQ2);
        if (AverageMQ2>=40 && GetMarksEQ2>=33  && GetMarksMQ2>=33 && GetMarksSQ2>=33) {
            System.out.println("Congrats you'r promoted\n");
        }
        else {
            System.out.println("you'r failed\n");
        }
        System.out.println("Question2 end\n");

        // Question3 -

        Scanner GetIncome = new Scanner(System.in);
        System.out.println("Enter you'r income in lakhs anumm : \n");
        float taxQ1 =  0;
        float IncomeLQ1 = GetIncome.nextFloat();
        if(IncomeLQ1 <= 2.5) {
            taxQ1 = taxQ1 + 0;
        }
        else if(IncomeLQ1 > 2.5f && IncomeLQ1 <= 5f) {
            taxQ1 = taxQ1 + 0.05f * (IncomeLQ1 - 2.5f);
        }
        else if (IncomeLQ1 > 5f && IncomeLQ1 <=10.0f) {
            taxQ1 = (float) (taxQ1 + 0.05f * (5.0f-2.5f));
            taxQ1 = (float) (taxQ1 + 0.02f * (IncomeLQ1 - 5f));
        }
        else if (IncomeLQ1>10.0f) {
            taxQ1 = (float) (taxQ1+0.05f* (5.0f-2.5f));
            taxQ1 = taxQ1 + 0.2f * (10.0f - 5f);
            taxQ1 = taxQ1 + 0.3f * (IncomeLQ1-10.0f);

        }
        System.out.println("Tax : " +taxQ1);
        System.out.println("Question3 end \n");

        // Question 4 -

        Scanner GetDayNum = new Scanner(System.in);
        System.out.println("Enter Day in Number : ");
        int Day = GetDayNum.nextInt();
        switch (Day) {
            case 1:
            System.out.println("Monday\n");
                break;
            case 2:
                System.out.println("Tuesday\n");
                break;
            case 3:
                System.out.println("Wednesday\n");
                break;
            case 4:
                System.out.println("Thursday\n");
                break;
            case 5:
                System.out.println("Friday\n");
                break;
            case 6:
                System.out.println("Saturday\n");
                break;
            case 7:
                System.out.println("Sunday\n");
                break;
            default:
                System.out.println("Please provide a number\n");
                break;
        }
        System.out.println("Question4 end \n");

        // Question 5
        int LeapYear;
        System.out.println("Enter Year : ");
        Scanner GetYearNumb = new Scanner(System.in);
        LeapYear = GetYearNumb.nextInt();
        if (LeapYear%4==0) {
            System.out.println("Leap Year!");
        }
        else{
            System.out.println("No it's not a Leap Year!");
        }
        System.out.println("Question6 end \n");

        // Question 6
        String Website;
        System.out.println("Enter Website : ");
        Scanner GetWebType = new Scanner(System.in);
        Website = GetWebType.next();
        if (Website.endsWith(".com")) {
            System.out.println("Commerical");
        } else if (Website.endsWith(".org")) {
            System.out.println("Organizational");
        } else if (Website.endsWith(".in")) {
            System.out.println("Indian");
        }
        System.out.println("Question 6 end \n");
    }

}
