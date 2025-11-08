package com.beauce.testdatabuilder.domain;

public record Hero(String name, int level, Weapon weapon) {
    public Hero {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hero name cannot be blank");
        }
        if (level < 1) {
            throw new IllegalArgumentException("Hero level must be at least 1");
        }
        if (weapon == null) {
            throw new IllegalArgumentException("Hero must have a weapon");
        }
    }

    @Override
    public String toString() {
        return name + " (Lvl " + level + ") wielding " + weapon;
    }
}
