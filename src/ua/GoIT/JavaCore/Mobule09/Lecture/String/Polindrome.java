package ua.GoIT.JavaCore.Mobule09.Lecture.String;

public class Polindrome {
    public static void main(String[] args) {
        String polindrome = "mogfom";
        char[] charPolindrome = polindrome.toCharArray();
        boolean statusOfPolindrome = true;
        for (int i = 0; i < charPolindrome.length/2; i++) {
            if (charPolindrome[i] != charPolindrome[charPolindrome.length - i - 1]) {
                statusOfPolindrome = false;
                break;
            }
        }
        if (!statusOfPolindrome) {
            System.out.println("Is not polindrome!");
        } else {
            System.out.println("Is polindrome!");
        }
    }
}
