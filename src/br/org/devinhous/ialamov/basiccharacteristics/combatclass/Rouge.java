package br.org.devinhous.ialamov.basiccharacteristics.combatclass;

import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Dagger;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Sword;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;

import java.util.ArrayList;
import java.util.List;

public class Rouge extends CombatClass {

    private Double hp = 15d;
    private Double atk = 4d;

    public Double getHp() {
        return hp;
    }
    public Double getAtk() {
        return atk;
    }

        @Override
    public List<Weapons> showAvailableWeapons() {
        Sword sword = new Sword("Espada curta", 7d);
        Dagger dagger = new Dagger("Adaga afiada", 5d);

        List<Weapons> weapons = new ArrayList<>();
        weapons.add(sword);
        weapons.add(dagger);

        return weapons;
    }
}
