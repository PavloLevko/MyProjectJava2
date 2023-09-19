package Organism.Animal;

import Organism.Organism;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal extends Organism {
    private String animalIcon;
    private double weightOfAnimal;
    private int maxAnimalsInCell;
    private int speedOfAnimal;
    private double weightOfFullSaturation;
    private int health;
    private boolean isAlive;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();

    public Map<Organism, Integer> getWhoCanBeEaten() {
        return whoCanBeEaten;
    }

    public void eat (){
    }
    public void reproduce (){
    }
    public void move (){
    }
    public void dead(){
    }

    public String getAnimalIcon() {
        return animalIcon;
    }

    public void setAnimalIcon(String animalIcon) {
        this.animalIcon = animalIcon;
    }

    public double getWeightOfAnimal() {
        return weightOfAnimal;
    }

    public void setWeightOfAnimal(double weightOfAnimal) {
        this.weightOfAnimal = weightOfAnimal;
    }

    public int getMaxAnimalsInCell() {
        return maxAnimalsInCell;
    }

    public void setMaxAnimalsInCell(int maxAnimalsInCell) {
        this.maxAnimalsInCell = maxAnimalsInCell;
    }

    public int getSpeedOfAnimal() {
        return speedOfAnimal;
    }

    public void setSpeedOfAnimal(int speedOfAnimal) {
        this.speedOfAnimal = speedOfAnimal;
    }

    public double getWeightOfFullSaturation() {
        return weightOfFullSaturation;
    }

    public void setWeightOfFullSaturation(double weightOfFullSaturation) {
        this.weightOfFullSaturation = weightOfFullSaturation;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
