package com.company;
// Multidimensional Arrays in Java
public class video28 {
    public static void main(String[] args) {
        // Creating Two Dimensional Array
        int[] array; // array 1-D(Dimensional)
        int[][] array2; // array 2-D(Dimensional)
        array2 = new int[2][3];
        array2[0][0] = 201;
        array2[0][1] = 202;
        array2[0][2] = 203;
        array2[1][0] = 204;
        array2[1][1] = 205;
        array2[1][2] = 206;
        // Displaying array
        System.out.println("Printing 2D array -:");
        for (int a = 0; a < array2.length; a++) {
            for (int b = 0; b < array2[a].length; b++){
                System.out.print(array2[a][b]);
                System.out.println(" ");

            }

        }



    }
}
