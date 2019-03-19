public class Rectangle implements AreaShape {
    int width, height;

    public Rectangle(int width, int height)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public void draw() {
        System.out.print("Rectangle");
    }
}
