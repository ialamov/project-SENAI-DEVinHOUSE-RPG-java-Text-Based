package br.org.devinhous.ialamov.basiccharacteristics.characters.enemys;

import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.Armor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;
import br.org.devinhous.ialamov.gameSettings.actions.dice.Dice;
import br.org.devinhous.ialamov.gameSettings.difficulty.Difficulty;


public abstract class Enemys {
    protected double basicAtk;
    protected double hp;
    protected Weapons weapon;
    protected Armor armor;
    protected Dice dice = new Dice();

    public void setHP() {
        this.hp = hp;
    }

    public void receiveDamage(Double subtractHp) {
        Double totalHp = this.hp - subtractHp;
        if (totalHp < 0) {
            this.hp = 0d;
        } else {
            this.hp = totalHp;
        }
    }

    public double dealDamage(Difficulty difficulty) {
        Double damage = basicAtk + weapon.calculateDamage();
        if (difficulty.equals(Difficulty.EASY)) {
            damage *= difficulty.getModifier();
        }
        return damage;
    }

    public double getHp() {
        return hp;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void showCharacterStats() {
        System.out.println("O HP do inimigo está em " + this.hp);
    }
}
