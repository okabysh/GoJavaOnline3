package ua.GoIT.JavaCore.Module04.HomeWork1;

public class AreaOfATriangle {
    private int sideA;
    private int height;
    private float area;
    public AreaOfATriangle(int sideA, int height) {
        this.sideA = sideA;
        this.height = height;
    }

    public float getArea() {
        area = 0.5f * sideA * height;
        return area;
    }
}
