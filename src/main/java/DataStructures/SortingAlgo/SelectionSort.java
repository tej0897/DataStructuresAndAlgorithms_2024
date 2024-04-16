package DataStructures.SortingAlgo;

public class SelectionSort {

    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[largest] < intArray[i]){
                    largest = i;
                }
            }
            swapNumbers(intArray, largest, lastUnsortedIndex);
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
