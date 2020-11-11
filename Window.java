import javax.swing.text.JTextComponent.KeyBinding;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

/**
 * THIS CLASS CREATES AN INSTANCE OF THE OBJECT SOLAR SYSTEM
 */

public class Window
{

    private static SolarSystem SolarSystem;

    SolarSystem galaxy = new SolarSystem(1100, 1100) ;

    int movement=0;
    int x = movement;

    SolarObject Sun = new SolarObject(0,0,70,"YELLOW");
    SolarObject Mercury = new SolarObject(80,0,15,"GREEN");
    SolarObject Venus = new SolarObject(130,2,15,"CYAN");
    SolarObject Earth = new SolarObject(180,0,30,"BLUE");
    SolarObject Mars = new SolarObject(260,0,35,"ORANGE");
    SolarObject Jupiter = new SolarObject(460,0,50,"GREY");

    //SolarObject Saturn = new SolarObject(350,0,15,"BLUE");

    Moon moon = new Moon(35,0,10,"LIGHT_GREY",20,0);

    Moon[] asteroids = new Moon[200];

/**
 * creates a window of the solar system
 * creates instances sof the object planets using 
 * drawSolarObject 
 * objects can be displayed in the solar system
 * @param movement is the speed of movement of the planet
 */
    public Window()
    {
        // super(1100,1100);

        while(true)
        {
            // galaxy.drawSolarObject(0,0,70,"YELLOW");
            galaxy.drawSolarObject(Sun.getDistance(),Sun.getAngle(), Sun.getDiameter(), Sun.getCol());
            galaxy.drawSolarObject(Mercury.getDistance(),Mercury.getAngle(), Mercury.getDiameter(), Mercury.getCol());
            galaxy.drawSolarObject(Mercury.getDistance(),Mercury.getAngle(), Mercury.getDiameter(), Mercury.getCol());
            galaxy.drawSolarObject(Venus.getDistance(),Venus.getAngle(), Venus.getDiameter(), Venus.getCol());
            galaxy.drawSolarObject(Earth.getDistance(),Earth.getAngle(), Earth.getDiameter(), Earth.getCol());
            galaxy.drawSolarObject(Mars.getDistance(),Mars.getAngle(), Mars.getDiameter(), Mars.getCol());
            galaxy.drawSolarObject(Jupiter.getDistance(),Jupiter.getAngle(), Jupiter.getDiameter(), Jupiter.getCol());
            // drawSolarObject(Saturn.getDistance(),Saturn.getAngle(), Saturn.getDiameter(), Saturn.getCol());

            galaxy.drawSolarObjectAbout(moon.getDistance(),moon.getAngle(), moon.getDiameter(), moon.getCol(), moon.getcentreOfRotationDistance(), moon.getcentreOfRotationAngle()); //earth's moon
            
            Mercury.move(1.5);
            Venus.move(1.2);
            Earth.move(1.1);
            Mars.move(1);
            Jupiter.move(0.7);
            moon.moveMoon(2,Earth.getDistance(),Earth.getAngle());
            // Saturn.move(1);

            
            galaxy.finishedDrawing();

        }
    }


public static void main( String[] args){
    
    new Window();

}

}

// drawSolarObjectAbout(150,x,10,"GREY",20,x*2); //earth's moon

// drawSolarObject(0,0,60,"YELLOW");

// Planets[] Solarplanets = new Planets[10];
// Planets Sun = new Sun();

// Solarplanets[1] = new Sun();

// earth = drawSolarObject(150,x,15,"BLUE");

// e.Planet(super);