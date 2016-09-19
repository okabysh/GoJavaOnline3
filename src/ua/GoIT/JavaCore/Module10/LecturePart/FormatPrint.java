package ua.GoIT.JavaCore.Module10.LecturePart;

public class FormatPrint {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);
        System.out.format("The square root of %d is %f.%n",i,r);
    }
}
