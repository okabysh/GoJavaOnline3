package src.Module_05_1;

public class ArrayMinMax {
    public static void main(String[] args) {
        int myArray[] = {-33333,3,5,9,100,444,333,222};
        int minElement = 2147483647;
        int maxElement = -2147483648;
        for (int elementArray : myArray) {
            if (elementArray > maxElement) {
                maxElement = elementArray;
            }
            if (elementArray < minElement) {
                minElement = elementArray;
            }
        }
        System.out.println("Min value of array: " + minElement);
        System.out.println("Max value of array: " + maxElement);
    }
}
