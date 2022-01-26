package br.org.devinhous.ialamov.basiccharacteristics.equipment.armor;

public abstract class Armor {
    protected String name;

    protected Double weight;

    protected Double defense;

    public Armor(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void addDefense(Double adicionalDefense) {
        this.defense += adicionalDefense;
    }

    public double reduceDamageTaken(Double damageTaken) {
        return damageTaken - defense * (Math.random() + 0.3);
    }

    protected void setDefense(Double defense) {
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }
}
