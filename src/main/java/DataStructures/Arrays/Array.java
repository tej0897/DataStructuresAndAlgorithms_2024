package DataStructures.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arrayExample = new int[5];

        arrayExample[0] = 1;
        arrayExample[1] = 21;
        arrayExample[2] = -3;
        arrayExample[3] = 43;
        arrayExample[4] = 0;


        for (int i=0; i< arrayExample.length; i++) {
            System.out.println(arrayExample[i]);
        }

        // type 2 of array with enhanced for loop

        int [] arrayExample2 = {1, 21, -3, 43, 0};

        for (int j : arrayExample2) {
                System.out.println(j);
        }

    }
}
