package br.org.devinhous.ialamov.basiccharacteristics.combatclass;

import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Axe;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Sword;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends CombatClass {

    private Double hp = 10d;
    private Double atk = 7d;

    public Double getHp() {
        return hp;
    }
    public Double getAtk() {
        return atk;
    }

    @Override
    public List<Weapons> showAvailableWeapons() {
        Sword sword = new Sword("Espada longa", 10d);
        Axe axe = new Axe ("Machado leve", 20d);

        List<Weapons> weapons = new ArrayList<>();
        weapons.add(sword);
        weapons.add(axe);

        return weapons;
    }
}
