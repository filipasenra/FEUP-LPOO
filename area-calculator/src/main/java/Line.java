public class Line implements Shape{
    int length;

    public Line(int length)
    {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.print("Line");
    }
}
