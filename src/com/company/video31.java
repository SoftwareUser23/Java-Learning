package com.company;
// Methods in Java
public class video31 {
    public static void main(String[] args) {
        int a = 51;
        int b = 17;
        int c;
        c = logic(a, b);
        System.out.println(a + " "+ b);
        System.out.println("Next Values\t");
        int a1 = 12;
        int b1 = 11;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 15;
        }
        x = 226;
        return z;
    }

}

