package br.org.devinhous.ialamov.gameSettings.actions.combat;

import br.org.devinhous.ialamov.basiccharacteristics.characters.enemys.Enemys;
import br.org.devinhous.ialamov.basiccharacteristics.characters.heroe.Heroe;
import br.org.devinhous.ialamov.gameSettings.actions.dice.Dice;
import br.org.devinhous.ialamov.gameSettings.difficulty.Difficulty;

public class Combat {

    private Enemys enemys;
    private Heroe heroe;

    public Combat(Enemys enemys, Heroe heroe) {
        this.enemys = enemys;
        this.heroe = heroe;
    }

    public void damageAgainstEnemys(Heroe heroe, Enemys enemys, Difficulty difficulty) {
        Dice dice = new Dice();
        Double d20 = dice.d20();

        if (d20.equals(1d)) {
            System.out.println("Você errou o ataque! Não houve dano ao inimigo");
            enemys.showCharacterStats();

        } else if (d20.equals(20d)) {
            double damage = heroe.dealDamage(difficulty) + d20;
            enemys.receiveDamage(damage);
            enemys.showCharacterStats();

        } else {
            double damage = enemys.dealDamage(difficulty) + d20;
            Double armorDamage = enemys.getArmor().reduceDamageTaken(damage);
            enemys.receiveDamage(armorDamage);
            enemys.showCharacterStats();
        }
    }

    public void damageAgainstHeroe(Heroe heroe, Enemys enemys, Difficulty difficulty) {
        Dice dice = new Dice();
        Double d20 = dice.d20();

        if (d20.equals(1d)) {
            System.out.println("O inimigo errou o ataque! Você não sofreu dano");
            System.out.println("********************************* STATUS *********************************");
            heroe.showCharacterStats();

        } else if (d20.equals(20d)) {
            double damage = enemys.dealDamage(difficulty) + d20;
            heroe.subtractHp(damage);
            heroe.checkIfAlive();
            System.out.println("O inimigo atacou! Você sofreu " + damage + " de dano e agora possui " +
                    heroe.getHp() +  " pontos de vida.");
            System.out.println("********************************* STATUS *********************************");
            heroe.showCharacterStats();

        } else {
            double damage = enemys.dealDamage(difficulty) + d20;
            Double armorDamage = heroe.getArmor().reduceDamageTaken(damage);
            heroe.subtractHp(damage);
            heroe.checkIfAlive();
            System.out.println("O inimigo atacou! Você sofreu " + armorDamage + " de dano e agora possui " +
                    heroe.getHp() +  " pontos de vida.");
            System.out.println("********************************* STATUS *********************************");
            heroe.showCharacterStats();
        }
    }
}
