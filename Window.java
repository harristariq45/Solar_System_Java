import javax.swing.text.JTextComponent.KeyBinding;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;


	/**
	 * THIS CLASS CREATES AN INSTANCE OF THE OBJECT SOLAR SYSTEM
	 */


public class Window {
    private static SolarSystem SolarSystem;


    /**
	 * creates a window of the solar system
	 * creates instances of the object planets using 
	 * drawSolarObject 
	 * objects can be displayed in the solar system
	 * @param movement is the speed of movement of the planet
	 */


    public static void main( String[] args){
       SolarSystem =  new SolarSystem(1000,1000);   
    
      

        int movement=0;
        

        while(true){
            SolarSystem.drawSolarObject(0,0,60,"YELLOW");
            int x = movement; 
            movement = movement+1;
            SolarSystem.drawSolarObject(150,x,15,"BLUE");
            SolarSystem.drawSolarObjectAbout(150,x,10,"GREY",20,x*2);
            SolarSystem.drawSolarObject(90,x,15,"CYAN");
            SolarSystem.finishedDrawing();
        }

    }    

}