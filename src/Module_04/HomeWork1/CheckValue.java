package Module_04.HomeWork1;

public class CheckValue {
    private int value;

    public CheckValue(int value) {
        this.value = value;
    }

    public boolean check() {
        if (value <= 0) {
            System.out.println("You enter value: " + value + ". It is a negative or zero value, please enter positive value.");
            return false;
        } else {
            return true;
        }
    }
}
