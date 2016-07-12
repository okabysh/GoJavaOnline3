package src.Module_04_1;

public class CheckValue {
    private int value;

    CheckValue(int value) {
        this.value = value;
    }

    public boolean Check() {
        if (value <= 0) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("You enter value: " + value + ". It is a negative or zero value, please enter positive value.");
            } finally {
                return false;
            }
        } else {
            return true;
        }
    }
}
