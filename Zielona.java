import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zielona extends Ryba
{
    public Zielona(){
        szybkosc=3;
        setRotation(Greenfoot.getRandomNumber(45)+25);
    }

    public void act() 
    {
        super.act();
        //move(szybkosc);
    }    
}
