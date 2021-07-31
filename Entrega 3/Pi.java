import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pi extends Actor
{
    GifImage myGif = new GifImage("5.gif");
    /**
     * Act - do whatever the Pi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()//Un gif tambien que puse, y lo puse que camina para afrente. 
    {
        setImage( myGif.getCurrentImage() );
        move(1);
    }
}
