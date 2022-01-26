package br.org.devinhous.ialamov.basiccharacteristics.characters.enemys;

import br.org.devinhous.ialamov.basiccharacteristics.combatclass.CombatClass;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.Armor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;
import br.org.devinhous.ialamov.basiccharacteristics.gender.Gender;

public class OrcAmourer extends Enemys {

    public OrcAmourer(Weapons weapon, Armor armor) {
        this.hp += dice.d20() + 30d;
        this.basicAtk = 5d + dice.d20();
        this.weapon = weapon;
        this.armor = armor;
    }
}
