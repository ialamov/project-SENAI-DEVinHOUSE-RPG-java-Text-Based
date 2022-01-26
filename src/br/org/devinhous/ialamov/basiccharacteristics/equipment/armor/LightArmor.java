package br.org.devinhous.ialamov.basiccharacteristics.equipment.armor;

public class LightArmor extends Armor {

    public LightArmor(String name, Double weight) {
        super(name, weight);
        this.setDefense(10d);
    }
}
