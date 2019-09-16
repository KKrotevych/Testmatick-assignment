/**
 * Created by Work on 10.09.2019.
 */
public class Circle extends Figure {

    public Circle (float base, String color)
    {
        super(base,color);
    }
    public float areaCalculation()
    {
        return (float)Math.PI* getBase()* getBase();
    }

    public String getDescription() {
        return "Figure: circle, square: "+ areaCalculation()+" sq. units, radius: "+ getBase()+"units, color: "+GetColor();
    }


}
