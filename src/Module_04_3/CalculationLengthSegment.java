package src.Module_04_3;

public class CalculationLengthSegment {
    private int coordinateX1;
    private int coordinateY1;
    private int coordinateX2;
    private int coordinateY2;
    private double lengthSegment;

    CalculationLengthSegment(int coordinateX1, int coordinateY1, int coordinateX2, int coordinateY2) {
        this.coordinateX1 = coordinateX1;
        this.coordinateY1 = coordinateY1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY2 = coordinateY2;
    }

    public double getLengthSegment() {
        double lengthSegment = Math.sqrt(Math.pow(Math.abs(coordinateX2-coordinateX1),2)+Math.pow(Math.abs(coordinateY2-coordinateY1),2));
        return lengthSegment;
    }
}
