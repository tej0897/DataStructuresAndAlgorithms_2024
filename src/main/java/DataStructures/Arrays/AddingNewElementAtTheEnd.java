package DataStructures.Arrays;

import java.util.Arrays;

public class AddingNewElementAtTheEnd {
    public static void main(String[] args) {

        char[] oldArray = {'a', 'b', 'c'};
        char[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = 'd';

        for (char j : oldArray){
            System.out.println(j);
        }

        for (char i : newArray){
            System.out.println(i);
        }

        // int example

        int [] intArray = {1,2,3};
        int []  newIntArray = Arrays.copyOf(intArray, intArray.length+1);
        newIntArray[intArray.length]=4;

        System.out.println("New Int Array");
        for (int j : newIntArray){
            System.out.println(j);
        }

        System.out.println("Old int array");
        for (int i : intArray){
            System.out.println(i);
        }


    }
}
