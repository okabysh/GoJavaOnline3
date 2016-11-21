package ua.GoIT.JavaCore.SecondLoop.TestForEnterprise.Question6;

/**
 * Created by Oleg Kabysh on 21.11.2016.
 */
public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }
    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        //((Dog) new Hound()).sniff();
    }
    String st = new String;
}
