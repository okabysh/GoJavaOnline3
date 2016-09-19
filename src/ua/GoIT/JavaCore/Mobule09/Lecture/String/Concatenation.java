package ua.GoIT.JavaCore.Mobule09.Lecture.String;

public class Concatenation {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        s1 = s1.concat(s2);
        System.out.println(s1);

        String s3 = "a";
        String s4 = "b";
        s3 += s4;
        System.out.println(s3);
    }

}
