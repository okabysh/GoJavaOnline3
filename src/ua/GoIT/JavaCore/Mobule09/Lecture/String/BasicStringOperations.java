package ua.GoIT.JavaCore.Mobule09.Lecture.String;

import java.util.Arrays;

public class BasicStringOperations {
    public static void main(String[] args) {
        final char[] charArrayToString = {'a', 'r', 'r', 'a', 'y'};
        final String stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",","")
                .replace("[","")
                .replace("]","")
                .replace(" ","")
                .trim();
        System.out.println(stringToDisplay);
    }
}
