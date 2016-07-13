package src.Module_04_1;

public class CheckValue {
    private int value;

    CheckValue(int value) {
        this.value = value;
    }

    public boolean check() {
        if (value <= 0) {
            new MyException("You enter value: " + value + ". It is a negative or zero value, please enter positive value.");
            return false;
        } else {
            return true;
        }
    }
}
