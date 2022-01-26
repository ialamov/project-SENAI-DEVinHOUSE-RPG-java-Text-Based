package br.org.devinhous.ialamov.basiccharacteristics.equipment.armor;

public class HeavyArmor extends Armor {

    public HeavyArmor(String name, Double weight) {
        super(name, weight);
        setDefense(30d);
    }
}
