package DataStructures.Arrays;

import java.util.Scanner;

public class DeleteByNull {

    public static void main(String[] args) {

        char [] arrayExample = new char[5];

        arrayExample[0] = 'a';
        arrayExample[1] = 'b';
        arrayExample[2] = 'c';
        arrayExample[3] = 'd';
        arrayExample[4] = 'e';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Char to delete: \t");
        char element = scanner.next().charAt(0);
        int index = -1;

        for (int i=0; i< arrayExample.length; i++){
            if (arrayExample[i] == element) {
                index = i;
            }
        }

        System.out.println(index);
        arrayExample[index] = 0;

        System.out.println("New Array List: ");
        for (int j : arrayExample){
            System.out.println(j);
        }

    }
}
