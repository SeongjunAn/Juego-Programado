import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gi extends Actor
{
    GifImage myGif = new GifImage("6.gif");
    /**
     * Act - do whatever the Pi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //Es un gif que puse para que el world no se mire vacio. 
    {
        setImage( myGif.getCurrentImage() );
        move(1);
    }
}
