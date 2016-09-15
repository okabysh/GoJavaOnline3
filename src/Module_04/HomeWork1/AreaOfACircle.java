package Module_04.HomeWork1;

public class AreaOfACircle {
    private int radius;
    private double pi;
    private double area;
    public AreaOfACircle(int radius) {
        this.radius = radius;
        this.pi = Math.PI;
    }

    public double getArea() {
        area = radius * pi;
        return area;
    }
}
