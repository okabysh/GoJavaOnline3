package ua.GoIT.JavaCore.Module04.HomeWork1;

public class AreaOfARectangle {
    private int sideA;
    private int sideB;
    private int area;
    public AreaOfARectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getArea() {
        area = sideA * sideB;
        return area;
    }
}
