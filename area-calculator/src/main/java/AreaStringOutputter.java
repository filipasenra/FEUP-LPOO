public class AreaStringOutputter {
    SumProvider area_aggreagator;

    public AreaStringOutputter(SumProvider area_aggreagator)
    {
        this.area_aggreagator = area_aggreagator;
    }

    public String output() {
        return "Sum of areas: " + area_aggreagator.sum();
    }
}
