package Mobule09.Lecture.String;

public class ConvertCharArrays {
    public static void main(String[] args) {
        char[] charArrays = {'a', 'b', 'c', 'd'};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charArrays.length; i++) {
            stringBuilder.append(charArrays[i]);
        }
        System.out.println(stringBuilder.toString());
    }
}
