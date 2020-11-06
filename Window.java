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

/**
 * creates a window of the solar system
 * creates instances of the object planets using 
 * drawSolarObject 
 * objects can be displayed in the solar system
 * @param movement is the speed of movement of the planet
 */
    public Window()
    {

        super(1000,1000);
        int movement=0;

        while(true)
        {
            drawSolarObject(0,0,60,"YELLOW");
            int x = movement;
            movement = movement+1;
            drawSolarObject(150,x,15,"BLUE");
            drawSolarObjectAbout(150,x,10,"GREY",20,x*2);
            drawSolarObject(90,x,15,"CYAN");
            // Planets Neptune = new Planets(600,x,20,"GREEN" );
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
