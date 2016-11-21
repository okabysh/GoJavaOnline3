package ua.GoIT.JavaCore.SecondLoop.TestForEnterprise.Question5;

/**
 * Created by Oleg Kabysh on 21.11.2016.
 */
public class Bottom2 extends Top{
    public Bottom2(String s) {
        System.out.println("D");
    }
    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}
