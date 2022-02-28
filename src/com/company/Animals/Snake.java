package com.company.Animals;

import com.company.Animals.Reptiles;
import com.company.Interface.AnimalInterface;

import java.util.Scanner;

public class Snake extends Reptiles implements AnimalInterface {
    private String typeOfSnake;
    private boolean  poisonous;
    private boolean irritated;
    private boolean hungry;
    private String species;

    public Snake(double height, int weight, String location, String timeOfDay, String season,
                 String gender, int length, String vision, String hearingAbilities,
                 String typeOfReproduction, String typeOfSnake, boolean poisonous, boolean irritated,
                 boolean hungry, String species) {
        super(height, weight, location, timeOfDay, season, gender,
                length, vision, hearingAbilities, typeOfReproduction);
        this.typeOfSnake = typeOfSnake;
        this.poisonous = poisonous;
        this.irritated = irritated;
        this.hungry = hungry;
        this.species = species;
    }

    public String getTypeOfSnake(){
        if (typeOfSnake.equalsIgnoreCase("питон")||typeOfSnake.equalsIgnoreCase("анаконда")){
            poisonous=true;
        }
        return typeOfSnake;
    }

    public void setTypeOfSnake(String typeOfSnake) {
        this.typeOfSnake = typeOfSnake;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isIrritated() {
        return irritated;
    }

    public void setIrritated(boolean irritated) {
        this.irritated = irritated;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String food() {
        Scanner sc = new Scanner(System.in);
        if (species.equalsIgnoreCase("eggs") || species.equalsIgnoreCase("redants")) {
            return " жылан " + species + " жеди ";
        } else if (species != "eggs") {
            System.out.println("Эмне жединиз");
            species = sc.nextLine();
            return species + "жеди";
        } else if (species.equalsIgnoreCase("eggs")) {
            System.out.println("кайсы чымчыктын тукумун жединиз");
            species = sc.nextLine();
            return species + "жеди";

            String  eggs ;
            switch ("eggs") {
                case "Чабалекей":
                    System.out.println("10");
                    break;
                case "eggs > 10 ":
                    System.out.println("Курсагы ток");
                    break;
                case "eggs < 10":
                    System.out.println("курсагы ток" + hungry + irritated + true);
                    break;
            }
            }return species;

        }


    @Override
    public String tasksRequired() {
        if (typeOfSnake.equalsIgnoreCase("jaz")){
            return "уйкудан ойгонушат";
        }else if (typeOfSnake.equalsIgnoreCase("жай")){
            return "кунго куйгонду жакшы корушот";
        }else if (typeOfSnake.equalsIgnoreCase("куз")){
            return "жем издешет";
        }else if (typeOfSnake.equalsIgnoreCase("кыш")){ }
        return " жер астында бекинишет";
    }

    @Override
    public double dailyNorm(){
        if (typeOfSnake.equalsIgnoreCase("кундо ")) {
        } return 0.5;
    }

    @Override
    public boolean huntForFood(){
        return getSeason().equalsIgnoreCase("кыш") && isHungry();
    }

    @Override
    public void abilitiesOfCrawling() {
        System.out.println("salam");
    }

    @Override
    public boolean canReproduce() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "Snake{" +
                "typeOfSnake='" + typeOfSnake + '\'' +
                ", poisonous=" + poisonous +
                ", irritated=" + irritated +
                ", hungry=" + hungry +
                ", species='" + species + '\'' +
                '}';
    }
}
