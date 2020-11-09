import javax.swing.text.JTextComponent.KeyBinding;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

/**
 * THIS CLASS CREATES AN INSTANCE OF THE OBJECT SOLAR SYSTEM
 */

public class Window extends SolarSystem
{

    private static SolarSystem SolarSystem;
    int movement=0;
    int x = movement;
    SolarObject earth = new SolarObject(150,0,15,"BLUE");
    SolarObject[] asteroids = new SolarObject[200];

/**
 * creates a window of the solar system
 * creates instances sof the object planets using 
 * drawSolarObject 
 * objects can be displayed in the solar system
 * @param movement is the speed of movement of the planet
 */
    public Window()
    {

        super(1000,1000);

       // super = a;

        // int movement=0;
        // SolarObject earth = new SolarObject(150,x,15,"BLUE");

        while(true)
        {
            drawSolarObject(0,0,60,"YELLOW");
            drawSolarObject(earth.getDistance(),earth.getAngle(), earth.getDiameter(), earth.getCol());
        
            earth.move(1);
            // earth = drawSolarObject(150,x,15,"BLUE");
            
            // e.Planet(super);

            // Solarplanet Venus = new Solarplanet(90,2,15,"CYAN");
            // drawSolarObject(150,x,15,"BLUE");
            // drawSolarObjectAbout(150,x,10,"GREY",20,x*2);
            // drawSolarObject(90,x,15,"CYAN");
            finishedDrawing();

        }

    }


public static void main( String[] args){
    
    new Window();

}

}

         // drawSolarObject(0,0,60,"YELLOW");

            // Planets[] Solarplanets = new Planets[10];
        // Planets Sun = new Sun();

            // Solarplanets[1] = new Sun();
