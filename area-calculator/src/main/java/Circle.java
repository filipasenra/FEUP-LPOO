import static java.lang.Math.PI;

public class Circle implements AreaShape {
    int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.print("Circle");
    }
}
