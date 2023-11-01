package com.epam.mjc.stage0;

import lombok.Data;

@Data
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    private String getPawNoun() {
        return numberOfPaws == 1 ? "paw" : "paws";
    }

    public String getDescription() {
        String furStatus = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + getPawNoun() + " and " + furStatus + " fur.";
    }
}
