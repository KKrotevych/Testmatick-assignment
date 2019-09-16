/**
 * Created by Work on 10.09.2019.
 */
public class Trapezium  extends Figure {

    public Trapezium(float base, String color)
    {
        super(base,color);
    }
    public float getLowerBase ()
    {
        return getBase()*3;
    }
    @Override
    public float areaCalculation() {
        return (getBase()+getLowerBase())/2*getBase();
    }


    @Override
    public String getDescription() {
        return "Figure: trapezium, area: "+areaCalculation()+"sq. units, lower base: "+getLowerBase()+" units, color:"+GetColor();
    }
}
