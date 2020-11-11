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
    // private double centreOfRotationDistance; 
    // private double centreOfRotationAngle;

    public SolarObject(int x, double y, int diameter, String col)
    {
        this.distance = x;
        this.angle = y;
        this.diameter = diameter;
        this.col = col;
    }

    public double getAngle()
    {
        return angle;
    }

    public String getCol()
    {
        return col;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void move(double speed)
    {
        angle=angle+speed;
    }


}





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