import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paskowana extends Ryba
{
    public Paskowana(){
    szybkosc=2;
       setRotation(Greenfoot.getRandomNumber(45)+25);
    }
    public void act() 
    {
        super.act();
        //move(szybkosc);
    }    
}
