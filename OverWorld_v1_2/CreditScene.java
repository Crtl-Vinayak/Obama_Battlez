import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditScene extends World
{

    /**
     * Constructor for objects of class CreditScene.
     * 
     */
    public CreditScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CreditGif creditGif = new CreditGif();
        addObject(creditGif,640,360);
    }
}
