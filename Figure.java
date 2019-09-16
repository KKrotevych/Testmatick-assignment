/**
 * Created by Work on 10.09.2019.
 */
abstract  class Figure {
    private float base;
    private String color;

    public Figure (){}
    public Figure (float length, String Color){
        base =length;
        color =Color;
    }
    public float getBase()
    {
        return base;
    }
    public abstract float areaCalculation();
    public abstract String getDescription();
    public  String GetColor()
    {
     return color;
    }
}
