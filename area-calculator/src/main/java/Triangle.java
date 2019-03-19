public class Triangle implements AreaShape{

    int base, height;

    public Triangle(int base, int height)
    {
        this.base=base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base*height/2.0;
    }

    @Override
    public void draw() {
        System.out.print("Triangle");
    }
}
