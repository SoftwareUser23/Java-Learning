package com.company;
// String Methods in Java
// Strings are immutable
public class video14 {
    public static void main(String[] args) {
        String StringFirst  = "Java-Language\n";
        int FindValStr = StringFirst.length();
        System.out.println(StringFirst+FindValStr);

        String StringSecond = "This Is String.";
        System.out.println(StringSecond.toLowerCase());
        System.out.println(StringSecond.toUpperCase());

        String StringThird = " todo      ";
        System.out.println(StringThird.trim());

        String StringFourth = "Substring";
        System.out.println(StringFourth.substring(2));
        System.out.println(StringFourth.substring(1,9));

        String StringFifth = "m-disc";
        System.out.println(StringFifth.replace('c' , 's'));
        System.out.println(StringFifth.replace("sc", "scs"));

        String StringSixth = "this is 6th string";
        System.out.println(StringSixth.startsWith("th"));
        System.out.println(StringSixth.endsWith("inge"));

        String StringSeventh = "this is 7th string";
        System.out.println(StringSeventh.charAt(2));

        String StringEight = "this is 8th string";
        System.out.println("\n");
        System.out.println(StringEight.indexOf("is", 6));
        System.out.println(StringEight.indexOf("is", 5));
        System.out.println(StringEight.lastIndexOf("ng", 15));

        String StringNinth = "this is 9th string";
        System.out.println(StringNinth.equals("this is 9th string"));
        System.out.println(StringNinth.equalsIgnoreCase("ThIs Is 9tH StRing"));

        System.out.println("ESCAPE SEQUENCE \"");
        System.out.println("ESCAPE SEQUENCE \\");
        System.out.println("ESCAPE SEQUENCE \n char");
        System.out.println("ESCAPE SEQUENCE \t char");












    }
}
