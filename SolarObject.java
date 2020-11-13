import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;


public class SolarObject 
{
    private int distance;
    protected double angle;
    private int diameter;
    private String col;

    /**
     * initialises a round object which can be displayed in th ewindow at given co-ordinates
     * 
	 * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     */
    public SolarObject(int x, double y, int diameter, String col)
    {
        this.distance = x;
        this.angle = y;
        this.diameter = diameter;
        this.col = col;
    }

    /**
     * method to return the angle of the object i.e earth
     * @return angle to be used with drawSolarObject method
     * the angle (in degrees) that represents how far the object is around its orbit.
     */
    public double getAngle()
    {
        return angle;
    }
        /**
     * method to return the colour of the object i.e earth
     * @return colour to be used with drawSolarObject method
     * it is the colour of the object i.e. blue for earth
     */
    public String getCol()
    {
        return col;
    }
    /**
     * method to return the angle of the object i.e earth
     * @return distance to be used with drawSolarObject method
     * so that it returns the distance where the object is orbiting from the centre
     */
    public double getDistance()
    {
        return distance;
    }
    /**
     * method to return the angle of the object i.e earth
     * @return diameter to be used with drawSolarObject method
     * will return the size of the object
     */
    public double getDiameter()
    {
        return diameter;
    }

    /**
     * this method will be used to move the planets in their orbits
     * @param speed is the speed of the planet
     */

    public void move(double speed)
    {
        angle=angle+speed;
    }


}






// private double centreOfRotationDistance; 
// private double centreOfRotationAngle;


// public void Planet(SolarSystem a)
// {
//     a.drawSolarObject(this.diameter, this.angle, diameter, col);

// }



// public class SolarObject extends Window
// {
//     public int x;
//     public int y;
//     public int diameter;
//     // public String color;
//     // color = col; 
//     public Colour col;

//     public SolarObject(int x, int y, int diameter, Colour col)
//     {
//         this.x = x;
//         this.y = y;
//         this.diameter = diameter;
//         this.col= col;
//     }
// }


// public class Planets
// {  
//     public double distance;
//     public double angle;
//     public double diameter;
//     public String col;

//     public void SolarPlanet(double distanceM, double angleM, double diameterM, String colM)
//     {
//         distance = distanceM;
//         angle = angleM;
//         diameter = diameterM;
//         col = colM;

//         drawSolarObject(distance, angle, diameter, col);
//     }


// }

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