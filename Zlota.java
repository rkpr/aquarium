import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zlota extends Ryba
{
    public Zlota(){
    szybkosc=4;
    setRotation(Greenfoot.getRandomNumber(45)+25);
    }
    
    public void act() 
    {
        super.act();
        //move(szybkosc);
    }    
}
