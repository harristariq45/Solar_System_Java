import javax.swing.text.JTextComponent.KeyBinding;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

/** this class presents the graphical user interfece 
* to a model of solar system
* @author Harris Bin Tariq
* @version 1.0 
*/

public class Window
{

/**
 * creates a window of the solar system
 * creates instances of the solar object using 
 * drawSolarObject 
 * objects can be displayed in the solar system
 * @param movement is the speed of movement of the planet
 */

public static void main( String[] args)
{   // window created using solarSystem constructor in SolarSystem class
    SolarSystem galaxy = new SolarSystem(1100, 1100) ;

    // instances of solar objects intialised
    SolarObject Sun = new SolarObject(0,0,70,"YELLOW");
    SolarObject Mercury = new SolarObject(80,0,15,"GREEN");
    SolarObject Venus = new SolarObject(130,2,15,"CYAN");
    SolarObject Earth = new SolarObject(180,0,30,"BLUE");
    SolarObject Mars = new SolarObject(260,0,35,"ORANGE");
    SolarObject Jupiter = new SolarObject(460,0,50,"GREY");

    // instance of moon created using the Moon class
    Moon moon = new Moon(35,0,10,"LIGHT_GREY",20,0);

    // asteroids created using an array of solarObject
    SolarObject[] asteroids = new SolarObject[200];
    for(int i=0 ; i<asteroids.length ; i++)
    {   
        // RndRange method used to generate random distances and angles
        asteroids[i] = new SolarObject(rndRange(300, 350),rndRange(0, 360),5,"WHITE");
    }
    
    while(true)
    {
        //draw solar object used to create the visual presentation of the objects on the window
        galaxy.drawSolarObject(Sun.getDistance(),Sun.getAngle(), Sun.getDiameter(), Sun.getCol());
        galaxy.drawSolarObject(Mercury.getDistance(),Mercury.getAngle(), Mercury.getDiameter(), Mercury.getCol());
        galaxy.drawSolarObject(Mercury.getDistance(),Mercury.getAngle(), Mercury.getDiameter(), Mercury.getCol());
        galaxy.drawSolarObject(Venus.getDistance(),Venus.getAngle(), Venus.getDiameter(), Venus.getCol());
        galaxy.drawSolarObject(Earth.getDistance(),Earth.getAngle(), Earth.getDiameter(), Earth.getCol());
        galaxy.drawSolarObject(Mars.getDistance(),Mars.getAngle(), Mars.getDiameter(), Mars.getCol());
        galaxy.drawSolarObject(Jupiter.getDistance(),Jupiter.getAngle(), Jupiter.getDiameter(), Jupiter.getCol());
     
        galaxy.drawSolarObjectAbout(moon.getDistance(),moon.getAngle(), moon.getDiameter(), moon.getCol(), moon.getcentreOfRotationDistance(), moon.getcentreOfRotationAngle()); //earth's moon

        // for loop made to created all the asteroids
        for ( int i=0 ; i<asteroids.length ; i++ )
        {
            galaxy.drawSolarObject(asteroids[i].getDistance(),asteroids[i].getAngle(), asteroids[i].getDiameter(), asteroids[i].getCol());
            asteroids[i].move(rndRange(-3, 3));
        }

        //move metho used to move the objects 
        Mercury.move(1.5);
        Venus.move(1.2);
        Earth.move(1.1);
        Mars.move(1);
        Jupiter.move(0.7);
        moon.moveMoon(4,Earth.getDistance(),Earth.getAngle());
        
        //
        galaxy.finishedDrawing();

    }
}

    /**
     * random number generator to generate a number within a range
     * calculation localised makes the rest of the code more elegent
     * @param start minimum number
     * @param finish maximum number
     * @return will return a random number between the max and the minimum number
     */
    public static int rndRange (int start, int finish){

        return new Random().nextInt(finish + 1 - start) + start;
    }

}



// galaxy.drawSolarObject(0,0,70,"YELLOW");

// drawSolarObject(Saturn.getDistance(),Saturn.getAngle(), Saturn.getDiameter(), Saturn.getCol());

// drawSolarObjectAbout(150,x,10,"GREY",20,x*2); //earth's moon

// drawSolarObject(0,0,60,"YELLOW");

// Planets[] Solarplanets = new Planets[10];
// Planets Sun = new Sun();

// Solarplanets[1] = new Sun();

// earth = drawSolarObject(150,x,15,"BLUE");

// e.Planet(super);

// int movement=0;
// int x = movement;

// private SolarSystem SolarSystem;

// Random rnd = new Random();

// double 

// new Window();

// public Window()
// {
//     // super(1100,1100);


// }
