import static java.lang.Math.PI;

public class Ellipse implements AreaShape {
    int x_radius, y_radius;

    public Ellipse(int x_radius, int y_radius)
    {
        this.x_radius = x_radius;
        this.y_radius = y_radius;
    }

    public int getX_radius()
    {
        return x_radius;
    }

    public int getY_radius() {
        return y_radius;
    }

    @Override
    public double getArea() {
        return PI * x_radius * y_radius;
    }

    @Override
    public void draw() {
        System.out.print("Ellipse");
    }
}
