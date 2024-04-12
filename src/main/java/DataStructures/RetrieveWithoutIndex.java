package DataStructures;

import java.util.Scanner;

public class RetrieveWithoutIndex {
    public static void main(String[] args) {

        int [] arrayExample = new int[5];

        arrayExample[0] = 1;
        arrayExample[1] = 21;
        arrayExample[2] = -3;
        arrayExample[3] = 43;
        arrayExample[4] = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to search:\t");
        int element = scanner.nextInt();
        int index = -1;

        for (int i=0; i< arrayExample.length; i++) {
            if (arrayExample[i]==element){
                index=i;
                break;
            }
        }
        System.out.println("Index: "+index);
    }
}
