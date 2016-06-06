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
        /* SQRT(ABS(X2-X1)^2+ABS(Y2-Y1)^2)*/
        double lengthSegmentStep1 = Math.abs(coordinateX2 - coordinateX1);
        double lengthSegmentStep2 = Math.abs(coordinateY2 - coordinateY1);
        double lengthSegmentStep3 = Math.pow(lengthSegmentStep1,2) + Math.pow(lengthSegmentStep2,2);
        double lengthSegment = Math.sqrt(lengthSegmentStep3);
        return lengthSegment;
    }
}
