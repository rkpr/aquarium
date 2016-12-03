import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Ryba rybka;
    Licznik licznik;
    
    public Licznik zwrocLicznik(){
        return licznik;
    }

    public MyWorld()
    {    
        super(600, 400, 1);
        
        licznik = new Licznik();
        addObject(licznik, 50,10);
    }

    public void dodajRybke(){
        switch(Greenfoot.getRandomNumber(3)){
            case 0:{
                rybka = new Zielona();
                break;  
            }              
            case 1:{
                rybka = new Zlota();
                break;
            }
            case 2:{
                rybka = new Paskowana();
                break;
            }
        }
        addObject(rybka, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    public void act(){
        if (Greenfoot.mousePressed(this)){
            dodajRybke();
        }
        if(numberOfObjects() == 1){ //jeden bo zostal obiekt licznik
            for (int i=0; i<3; i++){
                dodajRybke();
            }
        }
    }
}

