package Module_04.HomeWork3;

public class CalculationOfALengthSegment {
    public static void main(String[] args) {
        int coordinateX1 = -4; //1
        int coordinateY1 = -5; //1
        int coordinateX2 = 6; //-2
        int coordinateY2 = 7; //4
        double LengthSegment = new CalculationLengthSegment(coordinateX1,coordinateY1,coordinateX2,coordinateY2).getLengthSegment();
        System.out.println("Coordinate point #1 is (" + coordinateX1 + "," + coordinateY1 + "), coordinate point #2 is (" + coordinateX2 + "," + coordinateY2 + "); length of the segment is " + LengthSegment + " mm");
    }
}
