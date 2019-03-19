public class AreaXMLOutputter {

    SumProvider area_aggreagator;

    public AreaXMLOutputter(SumProvider area_aggreagator)
    {
        this.area_aggreagator = area_aggreagator;
    }

    public String output(){
        return "<area>"+ area_aggreagator.sum() + "</area>";
    }
}
