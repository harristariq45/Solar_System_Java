public class Planets
{  
    public double distance;
    public double angle;
    public double diameter;
    public String col;

    public void SolarPlanet(double distanceM, double angleM, double diameterM, String colM)
    {
        distance = distanceM;
        angle = angleM;
        diameter = diameterM;
        col = colM;

        drawSolarObject(distance, angle, diameter, col);
    }







    
}













    // public static Window window;

    // public void Sun(double distance, double angle, double diameter, String col)
    // {
    //     // drawSolarObject(0,0,60,"YELLOW");
    //     distance = 0;
    //     angle = 0;
    //     diameter = 60;
    //     col = "YELLOW";
    // }



// public class Sun extends Window
// {
//     /**
// 	 *
// 	 */
// 	private static final long serialVersionUID = 1L;

//     drawSolarObject(0,0,60,"YELLOW");

// }