package br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons;

public abstract class Weapons {

    protected String name;

    protected Double weight;

    protected Double accuracy;

    protected Double damage;

    public Weapons(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double calculateDamage() {
        return Math.round(damage);
    }

    public Double getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    protected void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    protected void setDamage(double damage) {
        this.damage = damage;
    }

}
