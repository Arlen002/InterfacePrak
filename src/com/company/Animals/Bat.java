package com.company.Animals;

import com.company.Animals.Mammal;
import com.company.Interface.AnimalInterface;

public class Bat extends Mammal implements AnimalInterface {
    private int mosquitoesEaten;
    private String typesOfBats;

    public Bat(double height, int weight, String location,
               String timeOfDay, String season, String gender
               , String typesOfBats) {
        super(height, weight, location, timeOfDay, season, gender);
        this.typesOfBats = typesOfBats;
    }
    public int getMosquitoesEaten(int i) {
        return mosquitoesEaten;
    }

    public void setMosquitoesEaten(int mosquitoesEaten) {
        this.mosquitoesEaten = mosquitoesEaten;
    }

    public String getTypesOfBats() {
        return typesOfBats;
    }

    public void setTypesOfBats(String typesOfBats) {
        this.typesOfBats = typesOfBats;
    }


    @Override
    public String food() {
        if (getTypesOfBats().equalsIgnoreCase("fruits")) {
            return "Бул жарганаттын тамагы :\n1)Момо- жемиштерден \n2)Гулдун нектарларынан турат";
        } else if (getTypesOfBats().equalsIgnoreCase("blood")) {
            return "Бул жарганаттар:\n1)Сут эмуучулордун канын сорушат\n2)Чымчыктардын канын да ичишет";
        }  return getTypesOfBats();
    }

    @Override
    public String tasksRequired() {
        if (getTimeOfDay().equalsIgnoreCase("тун")&&
                getSeason().equalsIgnoreCase("жупташуу мезгил")) {
            return "Жарганат тамак издеп жатат." +
                    "\nThe bats reproduce";
        } else if (getTimeOfDay().equalsIgnoreCase("кундуз")) {
            return "Жарганат ункурдо уктап жатат.";
        }return getTimeOfDay()+ getSeason();
    }
    @Override
    public boolean huntForFood() {
        return getTimeOfDay().equalsIgnoreCase("тун") && getLocation().equalsIgnoreCase("жайыт");
    }
    @Override
    public boolean canReproduce() {
        return huntForFood() && getGender().equalsIgnoreCase("ургачы")
                && getSeason().equalsIgnoreCase("жупташуу мезгили");
    }
    @Override
    public double dailyNorm(){
        if(canReproduce()){
           mosquitoesEaten = 4500;
        }else if(getSeason().equalsIgnoreCase("жай")){
            mosquitoesEaten = 10000;
        }else if(huntForFood()){
            mosquitoesEaten=6000;
        }return mosquitoesEaten;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Bat{" +
                "mosquitoesEaten=" + mosquitoesEaten +
                ", typesOfBats='" + typesOfBats + '\'' +
                '}';
    }
}
