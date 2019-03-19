public class Square implements AreaShape{
    int side;

    public Square(int side)
    {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.print("Square");
    }
}
