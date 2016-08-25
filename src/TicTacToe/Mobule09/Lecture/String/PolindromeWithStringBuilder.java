package Mobule09.Lecture.String;

public class PolindromeWithStringBuilder {
    public static void main(String[] args) {
        String stringPolindrome = "momom";

        StringBuilder stringBuilder = new StringBuilder(stringPolindrome);
        stringBuilder.reverse();
        if (stringPolindrome.equals(stringBuilder.toString())) {
            System.out.println("It is polindrome)");
        } else {
            System.out.println("It is not polindrome!");
        }
    }
}
