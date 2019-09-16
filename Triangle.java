/**
 * Created by Work on 10.09.2019.
 */
public class Triangle extends  Figure {

    public Triangle (float base, String color)
    {
        super(base,color);
    }
    @Override
    public float areaCalculation() {
        return getBase()*getBase()/2;
    }
    public  float getHypotenuse ()
    {
        return (float)Math.sqrt(2*getBase()*getBase());
    }

    @Override
    public String getDescription() {
        return "Figure: triangle, area: "+areaCalculation()+" sq. units, hypotenuse: "+getHypotenuse()+" units, color: "+GetColor();
    }
}
