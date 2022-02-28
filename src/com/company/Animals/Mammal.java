package com.company.Animals;

import com.company.Animals.Animal;

public abstract class Mammal extends Animal {
    public Mammal(double height, int weight, String location, String timeOfDay, String season, String gender) {
        super(height, weight, location, timeOfDay, season, gender);
    }

    @Override
    public boolean canReproduce() {
        return false;
    }
}
