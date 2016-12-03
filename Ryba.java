import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ryba extends Actor
{
    boolean czyZlapana = false;
    int szybkosc;
    Licznik licznik = new Licznik(); 

    public void act() 
    {

        if(!czyZlapana){
            move(szybkosc);
            if(isAtEdge()){
                if(getX() > 595 || getX() < 5){
                    setRotation(180-getRotation()); //zmiana kierunku
                    getImage().mirrorVertically(); //odbicie lustrzane
                }else{
                    setRotation(-getRotation());

                }
            }
            if(Greenfoot.mousePressed(this)){
                getWorld().addObject(new Haczyk(), getX(), getY()); 
                czyZlapana = true;
            }
        }else{

            setLocation(getX(), getY()-5);
            this.szybkosc = 0;

            if(isAtEdge()){
                MyWorld swiat = (MyWorld) getWorld(); //odniesienie do klasy MyWorld
                Licznik licznik = swiat.zwrocLicznik();
                licznik.wynik();
                getWorld().removeObject(this);
            }
        }

    }

}    

