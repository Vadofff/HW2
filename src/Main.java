import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] myArray1 = {3,2,3,1,4,2,8,3};
        Integer[] myArray = {2, 3, 1, 7, 11};
        System.out.println("Original Array[]: " + Arrays.asList(myArray));
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Modified Array[]: " + Arrays.toString(myArray));
        arraySort.sort(myArray);
        arraySort.average(myArray);
        arraySort.invert(myArray1);
        System.out.println("Занулені дублікати: " + Arrays.asList(myArray1));
    }
}