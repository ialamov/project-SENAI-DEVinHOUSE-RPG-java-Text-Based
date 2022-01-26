package br.org.devinhous.ialamov.basiccharacteristics.characters.enemys;

import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.Armor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;

public class OrcMagician extends Enemys{

    public OrcMagician (Weapons weapon, Armor armor) {
        this.hp += 2d * dice.d20() + 30d;
        this.basicAtk = 10d + dice.d20();
        this.weapon = weapon;
        this.armor = armor;
    }

}
