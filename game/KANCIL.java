import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KANCIL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KANCIL extends Actor
{
    /**
     * Act - do whatever the KANCIL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   


    int skor=0;
    public void act() 
    {
        pindah();
        
        
        
        
        
        // Add your action code here.
        if (Greenfoot.isKeyDown("up")) 
            move(3);
        if (Greenfoot.isKeyDown("down")) 
            move(-3);
        if (Greenfoot.isKeyDown("left")) 
            turn(-3);
        if (Greenfoot.isKeyDown("right")) 
            turn(3);
            
        skor();
       {
       
    }
}
    
    public void skor()
    {
        if (isTouching(timun.class)){
            skor++;
            getWorld().showText("skor="+skor, 35, 10);
        }
        
    }
    
     public void pindah(){
        if(isTouching(kaktus.class)){
            gameover MyWorld = new gameover();
            Greenfoot.setWorld(MyWorld);
        }
    }
}
