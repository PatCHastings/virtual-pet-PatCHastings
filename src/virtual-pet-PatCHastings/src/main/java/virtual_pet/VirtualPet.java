package virtual_pet;

import java.sql.SQLOutput;

public class VirtualPet {

    private String petName;
    private int hungerLvl;
    private int thirstLvl;
    private int boredomLvl;

    private boolean isAlive;

    //constructor
    public VirtualPet(String name, int hungry, int thirsty, int bored, boolean isAlive) {
    this.petName = name;
    this.hungerLvl = 0;
    this.thirstLvl = 0;
    this.boredomLvl = 0;
    this.isAlive = true;

    }

    //getter methods
    public String getPetName() {
        return petName;
    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public int getThirstLvl() {
        return thirstLvl;
    }

    public int getBoredomLvl() {
        return boredomLvl;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    //setters
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setHungerLvl(int hungerLvl) {
        this.hungerLvl = hungerLvl;
    }

    public void setThirstLvl(int thirstLvl) {
        this.thirstLvl = thirstLvl;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setBoredomLvl(int boredomLvl) {
        this.boredomLvl = boredomLvl;
    }

    //METHODS: actions to feed, water, play w/ pet that will update those stats
    public void petsName() {
        System.out.println(petName);
    }

    public void feed() {
        hungerLvl = hungerLvl - 5;
        boredomLvl = boredomLvl +1;
    }

    public void water() {
        thirstLvl = thirstLvl - 5;
        boredomLvl = boredomLvl +1;
    }

    public void play() {
        boredomLvl = boredomLvl - 5;
        hungerLvl = hungerLvl +1;
        thirstLvl = thirstLvl +1;
    }

    public void isAlive() {
        isAlive = true;

    }


    // Tick methods
    public void hungryPet(int hungry) {
        hungerLvl += hungry;
    }

    public void thirstyPet (int thirsty) {
        thirstLvl += thirsty;
    }

    public void boredPet (int bored) {
        boredomLvl += bored;
    }

    public void status() {

            System.out.println(petName + "'s " + "Hunger: " + hungerLvl + " Thirst: " + thirstLvl + " boredom: " + boredomLvl);

            if (hungerLvl >= 18) {
                System.out.println(petName + " is starving.. You better feed it..");
            }
            else if (hungerLvl > 20) {
                System.out.println(petName + " just died from starvation... GAME OVER..");
                isAlive = false;
            }


    }



    // Tick
    public void tick() {
        hungerLvl = hungerLvl + 2;
        thirstLvl = thirstLvl + 2;
        boredomLvl = boredomLvl + 2;
        System.out.println(petName + "'s " + "Hunger: " + hungerLvl + " Thirst: " + thirstLvl + " boredom: " + boredomLvl);
    }

    //Test method
    public String parse(int i) {
        return i + "";
    }
}

