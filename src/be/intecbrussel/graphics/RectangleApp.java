package be.intecbrussel.graphics;

import be.intecbrussel.graphics.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle.");
        Rectangle rect = new Rectangle(20,25);
        Rectangle rect2 = new Rectangle();

        System.out.println("Height: " + rect.getHeight());
        System.out.println("Width: " + rect.getWidth());
        System.out.printf("Positions: %d, %d%n", rect.getX(), rect.getY());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        System.out.println("-".repeat(30));

        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Width: " + rect2.getWidth());
        System.out.printf("Positions: %d, %d%n", rect2.getX(), rect2.getY());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        System.out.println("-".repeat(30));

        rect.setHeight(-25);
        rect.setWidth(-20);
        rect.setX(100);
        rect.setY(100);

        rect2.setHeight(30);
        rect2.setWidth(22);
        rect2.setX(35);
        rect2.setY(25);

        System.out.println("Height: " + rect.getHeight());
        System.out.println("Width: " + rect.getWidth());
        System.out.printf("Positions: %d, %d%n", rect.getX(), rect.getY());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        System.out.println("-".repeat(30));

        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Width: " + rect2.getWidth());
        System.out.printf("Positions: %d, %d%n", rect2.getX(), rect2.getY());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
