import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kancildepan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kancildepan extends Actor
{
    /**
     * Act - do whatever the kancildepan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public kancildepan()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 600);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
