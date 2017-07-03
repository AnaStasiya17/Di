package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String args[]) { 

	    Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь треугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

        Point p1 = new Point(-5, 20);
        Point p2 = new Point(50, 2);
        System.out.println("Расстояние между точками \n" + p1 + " и \n" + p2 + "\nравно " + Math.round(p1.getDistance(p2)));
    }

}