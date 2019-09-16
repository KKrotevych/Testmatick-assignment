

/**
 * Created by Work on 10.09.2019.
 */
 class Square extends Figure {


   public Square(float base, String color)
   {
       super(base,color);
   }
    @Override
   public float areaCalculation(){
       return getBase()* getBase();

   }

    @Override
   public String getDescription ()
   {
       return "Figure: quadrat, area: "+ areaCalculation()+"sq. units, side length: "+ getBase()+"units, color: "+GetColor();
   }
}
