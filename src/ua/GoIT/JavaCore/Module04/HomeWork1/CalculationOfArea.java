package ua.GoIT.JavaCore.Module04.HomeWork1;

import java.util.Scanner;

public class CalculationOfArea {
    public static void main(String[] args) {
        // before
        //int rectangleSideA = 5;
        //int rectangleSideB = 25;
        //int trianleSideA = 7;
        //int triangleHeight = 7;
        //int circleRadius = 13;

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter 'rectangle side A':");
        int rectangleSideA = scanner.nextInt();

        boolean checkRectangleSideA = new CheckValue(rectangleSideA).check();
        if (!checkRectangleSideA) {
            return;
        }
        System.out.println("Please, enter number 'rectangle side B':");
        int rectangleSideB = scanner.nextInt();
        boolean checkRectangleSideB = new CheckValue(rectangleSideB).check();
        if (!checkRectangleSideB) {
            return;
        }
        int areaRectangle = new AreaOfARectangle(rectangleSideA,rectangleSideB).getArea();
        System.out.println("Incoming data: rectangle, side a = " + rectangleSideA + " mm, side b = " + rectangleSideB + " mm; area of a rectangle: " + areaRectangle + " mm^2");

        System.out.println("Please, enter number 'trianle side A':");
        int trianleSideA = scanner.nextInt();
        boolean checktTianleSideA = new CheckValue(trianleSideA).check();
        if (!checktTianleSideA) {
            return;
        }
         System.out.println("Please, enter number 'triangle height':");
        int triangleHeight = scanner.nextInt();
        boolean checkTriangleHeight = new CheckValue(triangleHeight).check();
        if (!checkTriangleHeight) {
            return;
        }

        float areaTriangle = new AreaOfATriangle(trianleSideA,triangleHeight).getArea();
        System.out.println("Incoming data: triangle, side a = " + trianleSideA + " mm, height = " + triangleHeight + " mm; area of a triangle: " + areaTriangle + " mm^2");

        System.out.println("Please, enter number 'circle radius':");
        int circleRadius = scanner.nextInt();
        boolean checkCircleRadius = new CheckValue(circleRadius).check();
        if (!checkCircleRadius) {
            return;
        }
        double areaCircle = new AreaOfACircle(circleRadius).getArea();
        System.out.println("Incoming data: circle, radius = " + circleRadius + " mm; area of a circle: " + areaCircle + " mm^2");

        System.out.println("Have a nice day!");
    }
}
