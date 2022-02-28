package com.company.Animals;

import com.company.Animals.Mammal;
import com.company.Interface.AnimalInterface;

public class Bear extends Mammal implements AnimalInterface {
    private int cub;
    private int poundsOfFood;

    public Bear(double height, int weight, String location,
                String timeOfDay, String season, String gender, int cub, int poundsOfFood) {
        super(height, weight, location, timeOfDay, season, gender);
        this.cub = cub;
        this.poundsOfFood = poundsOfFood;
    }

    public int getCub() {
        return cub;
    }

    public void setCub(int cub) {
        this.cub = cub;
    }

    public int getPoundsOfFood() {
        return poundsOfFood;
    }

    public void setPoundsOfFood(int poundsOfFood) {
        this.poundsOfFood = poundsOfFood;
    }

    @Override
    public boolean canReproduce() {
    if (huntForFood()&&getSeason().equalsIgnoreCase("жупташуу мезгили")){
        cub++;}
        return true;
    }

    @Override
    public String food() {
        if (getSeason().equalsIgnoreCase("жаз")){
            return "balyk \t bal жешет";
        }else if (getSeason().equalsIgnoreCase("жай")){
            return "Кышкыга тамак даярдашат";
        }else if (getSeason().equalsIgnoreCase("куз")){
            return "кузундо тамактарын жешип уктаганга кам корушот";
        }else if (getSeason().equalsIgnoreCase("кыш")) {
            return "кышы менен укташат";
        }return getSeason();

    }

    @Override
    public String tasksRequired() {
        if (getSeason().equalsIgnoreCase("жаз")){
            return "кундуз тамак издешет , туну укташат";
        }else if (getSeason().equalsIgnoreCase("жай ")){
            return "берлогага тамак чогулта башташат";
        }else if (getSeason().equalsIgnoreCase("куз")){
            return "чогулткан тамактарын жейт";
        }else {
            return "укташат";
        }
    }
    public double amountFood(){
        if (huntForFood()){}
           return poundsOfFood = 90;
    }

    @Override
    public double dailyNorm() {
        if (poundsOfFood==90&&getSeason().equalsIgnoreCase("куз")){
            return poundsOfFood*2;
        }else if (cub > 1){
            return  poundsOfFood*(cub/2+2);
        }
           return poundsOfFood;
        }

    @Override
    public boolean huntForFood() {
        if (getTimeOfDay()!= "тун"&&getSeason()
                !="кыш" && getLocation()!="берлога"){

        }return true;
    }
    @Override
    public String toString() {
        return super.toString()+"Bear{" +
                "cub=" + cub +
                ", poundsOfFood=" + poundsOfFood +
                '}';
    }
}
