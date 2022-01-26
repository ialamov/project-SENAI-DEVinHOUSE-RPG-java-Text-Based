package br.org.devinhous.ialamov.basiccharacteristics.characters.enemys;

import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.Armor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;


public class ChiefOrc extends Enemys {

    public ChiefOrc (Weapons weapon, Armor armor) {
        this.hp += 5d * dice.d20() + 30d;
        this.basicAtk = 15d + dice.d20();
        this.weapon = weapon;
        this.armor = armor;
    }
}
