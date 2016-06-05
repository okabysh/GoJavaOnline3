package src.Module_04_3;

public class CalculationOfALengthSegment {
    public static void main(String[] args) {
        int coordinateX1 = 1;
        int coordinateY1 = 1;
        int coordinateX2 = -2;
        int coordinateY2 = 4;
        double LengthSegment = new CalculationLengthSegment(coordinateX1,coordinateY1,coordinateX2,coordinateY2).getLengthSegment();
        System.out.println("Coordinate point #1 is ("+coordinateX1+","+coordinateY1+"), coordinate point #2 is ("+coordinateX2+","+coordinateY2+"); length of the segment is "+LengthSegment+" mm");
    }
}
