package src.Module_04_1;

public class AreaOfATriangle {
    private int sideA;
    private int height;
    private float area;
    AreaOfATriangle(int sideA, int height) {
        this.sideA = sideA;
        this.height = height;
    }

    public float getArea() {
        area = 0.5f * this.sideA * this.height;
        return area;
    }
}
