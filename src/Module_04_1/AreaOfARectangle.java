package src.Module_04_1;

public class AreaOfARectangle {
    private int sideA;
    private int sideB;
    private int area;
    AreaOfARectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getArea() {
        area = sideA * sideB;
        return area;
    }
}
