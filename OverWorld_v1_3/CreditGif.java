import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeetsWillemGif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditGif extends Actor {
    
    GifImage gifImage = new GifImage("end.gif");
    private boolean isPlaying = false;
    private int frames = 0;
    
    /**
     * Act - do whatever the robberyGif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        frames++;
        if(Greenfoot.isKeyDown("enter")) {
            frames = 0;
            isPlaying = true;
        }
        System.out.println("frames gif: " + frames);
        play();
    }
    
    private void play() {
        if(isPlaying == true) {
            setImage(gifImage.getCurrentImage());
        }
        if(frames == 360) {
            isPlaying = false;
            Greenfoot.setWorld(new MainMenu());
        }
    }   
}
