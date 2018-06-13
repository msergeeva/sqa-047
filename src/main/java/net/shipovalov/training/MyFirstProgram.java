package net.shipovalov.training;


public class MyFirstProgram {

    public static void main(String[] array) {
       Square s = new Square(15.0);
       Triangle tr = new Triangle(155.0 , 123.0);
       System.out.println("Площадь квадрата равна " + s.sayArea());
        System.out.println("Площадь треугольника равна " + tr.sayArea());
    }


    public static double triangleArea (Triangle t){
        double area = ((t.a * t.b) / 2);
        return area;
    }
}