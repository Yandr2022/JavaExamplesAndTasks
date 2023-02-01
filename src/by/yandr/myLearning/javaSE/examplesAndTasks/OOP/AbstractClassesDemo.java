package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class AbstractClassesDemo {
    public static void main(String[] args) {

        Shape[] shapes = {new Point(), new Triangle(3, 5), new Circle(9)};
        for (Shape shape : shapes) {
            System.out.println(shape + ", area: " + shape.area());
        }

    }
}
abstract class Shape{
    abstract  double area();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
class Point extends Shape {
    @Override
    double area() {
        return 0;
    }
}


class Triangle extends Shape {
    int cathetus1;
    int cathetus2;

    public Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    @Override
    double area() {
        return ((cathetus1 * cathetus2) / 2.0);
    }

    @Override
    public String toString() {
        return super.toString() + ": cathetus1 = " + cathetus1 +
                ", cathetus2 = " + cathetus2;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return (radius * radius) * 3.14;
    }

    @Override
    public String toString() {
        return super.toString() + ": radius = " + radius;
    }
}