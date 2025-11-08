package com.beauce.testdatabuilder.domain;

public record Weapon(String name, int damage, Blacksmith forgedBy) {
    public Weapon {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Weapon name cannot be blank");
        }
        if (damage <= 0) {
            throw new IllegalArgumentException("Weapon damage must be positive");
        }
        if (forgedBy == null) {
            throw new IllegalArgumentException("Weapon must have a blacksmith");
        }
    }

    @Override
    public String toString() {
        return name + " [" + damage + " dmg], forged by " + forgedBy.name();
    }
}
