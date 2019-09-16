import java.util.Random;

public class Main {
    static String colorSelection (int index)
    {
        String color = null;
        switch (index)
        {
            case 1:
                color = "Black";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Cyan";
                break;
            case 4:
                color = "Gray";
                break;
            case 5:
                color = "Green";
                break;
            case 6:
                color = "Magenta";
                break;
            case 7:
                color = "Orange";
                break;
            case 8:
                color = "Pink";
                break;
            case 9:
                color = "Red";
                break;
            case 10:
                color = "White";
                break;
            case 11:
                color = "Yellow";
                break;


        }
        return  color;
    }

    public static void main(String[] args) {

        int size =new Random().nextInt(49)+2;
        float base=new Random().nextFloat();


        Figure [] array=new Figure[size];
        for (int i=0;i<array.length;i++)
        {
            int color_index= new Random().nextInt(13)+1;
            int figute_index=new Random().nextInt(4)+1;

            switch (figute_index)
            {
                case 1:
                    array[i]=new Triangle(base,colorSelection(color_index));
                    break;
                case 2:
                    array[i]=new Square(base,colorSelection(color_index));
                    break;
                case 3:
                    array[i]=new Trapezium(base, colorSelection(color_index));
                    break;
                case 4:
                    array[i] =new Circle (base, colorSelection(color_index));
                    break;
            }
        }
        for (Figure item:array
             ) {System.out.println(item.getDescription());

        }








    }
}
