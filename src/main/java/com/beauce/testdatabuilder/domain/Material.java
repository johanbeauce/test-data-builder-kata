package com.beauce.testdatabuilder.domain;

public record Material(String name, int rarity) {
    public Material {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Material name cannot be blank");
        }
        if (rarity < 1 || rarity > 10) {
            throw new IllegalArgumentException("Material rarity must be between 1 and 10");
        }
    }

    @Override
    public String toString() {
        return name + " (rarity " + rarity + ")";
    }
}
