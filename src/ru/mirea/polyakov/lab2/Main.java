package ru.mirea.polyakov.lab2;

public class Main {

    public static void main(String[] args) {
	Ball c1 = new Ball(2.0, "Purple");
	System.out.println("Radius is " + c1.getRadius() + "; Color is " + c1.getColor()+ "; Area is " + c1.getArea());
	Ball c2 = new Ball(2.0);
	System.out.println("Radius is " + c2.getRadius()+ "; Color is " + c2.getColor() + "; Area is " + c2.getArea());
	Ball c3 = new Ball();
	System.out.println("Radius is " + c3.getRadius() + "; Color is " + c3.getColor() + "; Area is " + c3.getArea());
    }
}
