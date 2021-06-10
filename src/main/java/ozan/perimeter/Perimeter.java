package ozan.perimeter;

import java.util.Scanner;

@FunctionalInterface
interface PerimeterWrapper {
    public double calculatePerimeter(Integer radius);
}

/***
 * Author: OZAN YILDIZ - 6/10/2021
 * Project: Calculate Perimeter
 */
public class Perimeter {

    public static void main(String[] args) {
        Integer radius;
        System.out.println("Enter the radius:");
        Scanner scanInput = new Scanner(System.in);
        radius = Integer.parseInt(scanInput.nextLine());
        PerimeterWrapper perimeterWrapper = (radiusInput) -> {
            return 2 * Math.PI * radiusInput;
        };
        System.out.println("Perimeter for this radius:" + perimeterWrapper.calculatePerimeter(radius));
    }
}
