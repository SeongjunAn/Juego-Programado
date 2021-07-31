import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mu extends Actor
{
    GifImage myGif = new GifImage("9.gif");
    /**
     * Act - do whatever the Pi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //Gif que puse arriba del piano para que se mire mejor mi piano. 
    {
        setImage( myGif.getCurrentImage() );
    }
}
