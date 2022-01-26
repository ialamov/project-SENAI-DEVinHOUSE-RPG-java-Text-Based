package br.org.devinhous.ialamov.basiccharacteristics.characters.heroe;

import br.org.devinhous.ialamov.basiccharacteristics.combatclass.CombatClass;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.Armor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;
import br.org.devinhous.ialamov.basiccharacteristics.gender.Gender;
import br.org.devinhous.ialamov.gameSettings.actions.dice.Dice;
import br.org.devinhous.ialamov.gameSettings.difficulty.Difficulty;

public class Heroe {
    private String characterName;
    private String playerName;
    private Double basicAtk;
    private Double hp;
    private Double maxHp;
    private Gender gender;
    private CombatClass combatClass;
    private Weapons weapon;
    private Armor armor;

    Dice dice = new Dice();

    public Heroe(String characterName, String playerName, Gender gender, CombatClass combatClass, Weapons weapon, Armor armor) {
        this.characterName = characterName;
        this.playerName = playerName;
        this.basicAtk = Math.floor(Math.random() * 10d) + combatClass.getAtk();
        this.combatClass = combatClass;
        this.weapon = weapon;
        this.armor = armor;
        setGender(gender);
        this.hp = Math.random() * 20d + dice.d20() + this.gender.getHp() * dice.d20() + this.combatClass.getHp();
        this.maxHp = hp;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double dealDamage(Difficulty difficulty) {
        Double damage = basicAtk + weapon.calculateDamage();
        if (difficulty.equals(difficulty.HARD)) {
            damage *= difficulty.getModifier();
        }
        return damage;
    }

    public void showCharacterStats() {
        System.out.println("Jogador: " + this.playerName);
        System.out.println("Name: " + this.characterName);
        System.out.println("Gênero: " + this.gender);
        System.out.println("HP: " + this.hp);
        System.out.println("Classe: " + this.combatClass.getClass().getSimpleName());
        System.out.println("Arma: " + this.weapon.getName());
        System.out.println("Armadura: " + this.armor.getName());
    }

    public void fullHeal() {
        this.hp = this.maxHp;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Double getBasicAtk() {
        return basicAtk;
    }

    public Double getHp() {
        return hp;
    }

    public void checkIfAlive() {
        if (this.hp <= 0) {
            System.out.println("Descanse agora bravo guerreiro. Que odin te receba de braços abertos");
            System.exit(0);
        }
    }

    public void subtractHp(Double subtractHp) {
        Double totalHp = this.hp - subtractHp;
        if (totalHp < 0) {
            this.hp = 0d;
        } else {
            this.hp = totalHp;
        }
    }

    public Gender getGender() {
        return gender;
    }

    public CombatClass getCombatClass() {
        return combatClass;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }
}