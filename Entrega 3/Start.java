import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels. //Este es mi front page del video juego
        super(1250, 700, 1); 
    }
    
    public void act()
    { 
        if (Greenfoot.isKeyDown("enter")) //Es una funcion, que cuando apacha el teclado enter, se pasa al world Piano
        Greenfoot.setWorld(new Piano());
    }
}
