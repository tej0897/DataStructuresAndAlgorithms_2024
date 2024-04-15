package DataStructures.SortingAlgo;

public class BubbleSort {
    public static void main(String[] args) {

        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i+1]){
                    swapNumbers(intArray, i, i+1);
                }
            }
        }

        for (int j : intArray){
            System.out.println(j);
        }

    }

    // swap method

    public static void swapNumbers(int[] arr, int a, int b){

        if (a == b){
            return;
        }

        int temp;

        // swapping code

        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
