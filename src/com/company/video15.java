package com.company;
// Practice Set on Java Strings (Must Solve!)

public class video15 {
    public static void main(String[] args) {
        // Que 1 -
        String Que1Str = "String First";
        Que1Str = Que1Str.toLowerCase();
        System.out.println(Que1Str);
        System.out.println("Que 1 end\n");

        // Que 2 -
        String Que2Str = "Strings are fun!!!";
        Que2Str = Que2Str.replace(" ", "/");
        System.out.println(Que2Str);
        System.out.println("Que 2 end\n");

        // Que 3 -
        String Que3Str = "Dear <|name|>, Thanks a lot!";
        Que3Str= Que3Str.replace("<|name|>", "Software");
        System.out.println(Que3Str);
        System.out.println("Que 3 end\n");

        // Que 4 -
        String Que4Str = "Question  Four  from    practice  set";
        System.out.println(Que4Str.indexOf("  "));
        System.out.println(Que4Str.indexOf("   "));
        System.out.println("Que 4 end\n");

        // Que 5 -
        String Que5Str = "Dear Harry, \n\t This Java Course is Nice.\n \tThanks!";
        System.out.println(Que5Str);









    }

}
