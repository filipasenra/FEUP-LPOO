public class House implements HasArea {

    double area;

    public House(double area)
    {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
