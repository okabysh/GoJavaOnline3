package src.Module_04_1;

/**
 * Created by Oleg Kabysh on 05.06.2016.
 */
public class AreOfACircle {
    private int radius;
    private double pi;
    private double area;
    AreOfACircle(int radius) {
        this.radius = radius;
        this.pi = Math.PI;
    }

    public double getArea() {
        area = radius * pi;
        return area;
    }
}
