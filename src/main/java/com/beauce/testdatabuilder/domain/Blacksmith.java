package com.beauce.testdatabuilder.domain;

public record Blacksmith(String name, int experience, Material favoriteMaterial) {
    public Blacksmith {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Blacksmith name cannot be blank");
        }
        if (experience < 0) {
            throw new IllegalArgumentException("Blacksmith experience cannot be negative");
        }
        if (favoriteMaterial == null) {
            throw new IllegalArgumentException("Blacksmith must have a favorite material");
        }
    }

    @Override
    public String toString() {
        return name + " (" + experience + " yrs, loves " + favoriteMaterial.name() + ")";
    }
}
