package br.org.devinhous.ialamov.basiccharacteristics.combatclass;

import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;

import java.util.List;

public abstract class CombatClass {

    protected String name;

    protected Double hp;
    protected Double atk;

    public Double getHp() {
        return this.hp;
    }
    public Double getAtk() {
        return this.atk;
    }

    public abstract List<Weapons> showAvailableWeapons();
}
