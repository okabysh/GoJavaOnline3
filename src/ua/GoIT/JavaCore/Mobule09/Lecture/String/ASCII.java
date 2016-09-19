package ua.GoIT.JavaCore.Mobule09.Lecture.String;

import java.util.Arrays;

public class ASCII {
    public static void main(String[] args) {
        char[] charArray = new char[256];

        for (int i = 0; i < charArray.length; i++) {
            //if (i > 96 && i < 123) {
                charArray[i] = (char) i;
                System.out.println(i + ") " + charArray[i]);
            //}
        }
        System.out.println(Arrays.toString(charArray));
    }
}
