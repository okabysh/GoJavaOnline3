package src.Module_05_1;

public class SortBubble {
    public static void main(String[] args) {
        int myFirstArray[] = {5,2,1,8,4,9,7,0,3,6};
        int lenghtArray = myFirstArray.length;
        int tempValue = 0;
        boolean endSort = false;
        int iterations = 0;
        for (int j = 0; j < lenghtArray - 1; j++) {
            for (int i = 0; i < lenghtArray - 1; i++) {
                if (myFirstArray[i] > myFirstArray[i + 1]) {
                    tempValue = myFirstArray[i];
                    endSort = false;
                    myFirstArray[i] = myFirstArray[i + 1];
                    myFirstArray[i + 1] = tempValue;
                }
            }
            if (endSort) {
                iterations = j + 1;
                break;
            }
            endSort = true;
        }
        System.out.println("Lenght of array: " + lenghtArray);
        System.out.println("Array sorting method: Bubble");
        System.out.println("Number of iterations: " + iterations);
        for (int k = 0; k < lenghtArray; k++) {
            System.out.println(myFirstArray[k]);
        }
    }
}
