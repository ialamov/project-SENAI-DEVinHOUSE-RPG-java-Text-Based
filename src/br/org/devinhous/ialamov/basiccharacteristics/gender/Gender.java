package br.org.devinhous.ialamov.basiccharacteristics.gender;

public enum Gender {
    FEMALE("female", 0.4),
    MALE("male", 0.3),
    NONBINARY("nonbinary", 0.45);

    private String name;
    private double hp;

    Gender(String name, double number) {
        this.name = name;
        this.hp = Math.round(number * (Math.random() * (int) 100));
    }
    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }
}
