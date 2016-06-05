package src.Module_04_1;

public class CalculationOfArea {
    public static void main(String[] args) {
        int rectangleSideA = 5;
        int rectangleSideB = 25;
        int trianleSideA = 7;
        int triangleHeight = 7;
        int circleRadius = 13;
        int areaRectangle = new AreaOfARectangle(rectangleSideA,rectangleSideB).getArea();
        float areaTriangle = new AreaOfATriangle(trianleSideA,triangleHeight).getArea();
        double areaCircle = new AreOfACircle(circleRadius).getArea();
        System.out.println("Incoming data: rectangle, side a = "+rectangleSideA+" mm, side b = "+rectangleSideB+" mm; area of a rectangle: "+areaRectangle+" mm^2");
        System.out.println("Incoming data: triangle, side a = "+trianleSideA+" mm, height = "+triangleHeight+" mm; area of a triangle: "+areaTriangle+" mm^2");
        System.out.println("Incoming data: circle, radius = "+circleRadius+" mm; area of a circle: "+areaCircle+" mm^2");
        System.out.println("Have a nice day!");
    }
}
