package Mobule09.Lecture.String;

import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
        System.out.println("Please, enter numbers using comma delimiter: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(",");

        int[] intArray = new int[splittedStringArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(splittedStringArray[i]);
        }
        System.out.println(Arrays.toString(intArray)
                .replace("[","")
                .replace("]",""));

    }
}
