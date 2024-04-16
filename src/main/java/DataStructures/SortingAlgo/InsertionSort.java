package DataStructures.SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        for( int lastUnsortedIndex = 1; lastUnsortedIndex < intArray.length; lastUnsortedIndex++){
            int newElement = intArray[lastUnsortedIndex];
            int i;
            for ( i = lastUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for (int j : intArray){
            System.out.println(j);
        }
    }
}
