package br.org.devinhous.ialamov.gameplay;

import br.org.devinhous.ialamov.basiccharacteristics.characters.enemys.ChiefOrc;
import br.org.devinhous.ialamov.basiccharacteristics.characters.enemys.OrcAmourer;
import br.org.devinhous.ialamov.basiccharacteristics.characters.enemys.OrcMagician;
import br.org.devinhous.ialamov.basiccharacteristics.characters.heroe.Heroe;
import br.org.devinhous.ialamov.basiccharacteristics.combatclass.CombatClass;
import br.org.devinhous.ialamov.basiccharacteristics.combatclass.Rouge;
import br.org.devinhous.ialamov.basiccharacteristics.combatclass.Warrior;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.HeavyArmor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.armor.LightArmor;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Axe;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Dagger;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Sword;
import br.org.devinhous.ialamov.basiccharacteristics.equipment.weapons.Weapons;
import br.org.devinhous.ialamov.basiccharacteristics.gender.Gender;
import br.org.devinhous.ialamov.gameSettings.actions.combat.Combat;
import br.org.devinhous.ialamov.gameSettings.actions.dice.Dice;
import br.org.devinhous.ialamov.gameSettings.difficulty.Difficulty;
import br.org.devinhous.ialamov.gameSettings.story.acts.*;

import java.util.List;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Difficulty difficulty = null;
        String motivation;
        String playerName;
        String characterName;
        Gender gender;
        CombatClass combatClass;
        Integer optionSelected = 0;
        Weapons weapon;
        Dice dice = new Dice();

        System.out.println("------- Jornada do Imortal ------");

        System.out.println("Digite o seu nome: ");
        playerName = scanner.next();

        System.out.println("Bem vindo " + playerName + " digite o nome do seu personame: ");
        characterName = scanner.next();

        System.out.println("Selecione o nível de dificuldade do jogo: ");
        System.out.println("1 - Fácil");
        System.out.println("2 - Normal");
        System.out.println("3 - Difícil");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    difficulty = difficulty.EASY;
                    break;
                case 2:
                    difficulty = difficulty.NORMAL;
                    break;
                case 3:
                    difficulty = difficulty.HARD;
                    break;
                default:
                    difficulty = null;
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 1 || optionSelected > 3);

        System.out.println("Selecione o gênero do seu personagem: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.println("3 - Não binário");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    gender = Gender.MALE;
                    break;
                case 2:
                    gender = Gender.FEMALE;
                    break;
                case 3:
                    gender = Gender.NONBINARY;
                    break;
                default:
                    gender = null;
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        }  while (optionSelected < 1 || optionSelected > 3);


        System.out.println("Selecione uma classe para o seu personagem: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Ladrão");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    combatClass = new Warrior();
                    break;
                case 2:
                    combatClass = new Rouge();
                    break;
                default:
                    combatClass = null;
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 1 || optionSelected > 2);

        System.out.println("Selecione uma arma dentre as abaixo");
        List<Weapons> availableWeapons = combatClass.showAvailableWeapons();
        for (int i = 0; i < availableWeapons.size(); i++) {
            System.out.println(i + 1 + " - " + availableWeapons.get(i).getName());
        }
        weapon = availableWeapons.get(scanner.nextInt() - 1);

        Heroe newCharacter = new Heroe(playerName, characterName, gender, combatClass, weapon,
                new LightArmor("Armadura leve", 10d));

        System.out.println("Personagem criado com sucesso: ");
        newCharacter.showCharacterStats();

        Thread.sleep(2000);
        Act1 act = new Act1();
        System.out.println(act.getAct1());

        Thread.sleep(8000);
        Act2 act2 = new Act2();
        System.out.println(act2.getAct2());

        Thread.sleep(8000);
        Act3 act3 = new Act3();
        System.out.println(act3.getAct3());

        Thread.sleep(3000);
        Act4 act4 = new Act4();
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Vingança");
        System.out.println("2 - Glória");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    motivation = act4.getAct4V();
                    break;
                case 2:
                    motivation = act4.getAct4G();
                    break;
                default:
                    motivation = null;
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 1 || optionSelected > 2);

        Thread.sleep(2000);
        Act5 act5 = new Act5();
        System.out.println(act5.getAct5());

        Thread.sleep(8000);
        Act6 act6 = new Act6();
        System.out.println(act6.getAct6());

        Thread.sleep(8000);
        Act7 act7 = new Act7();
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Desistir");
        System.out.println("1 - Seguir");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 0:
                    System.out.println(act7.getAct7GUp());
                    Thread.sleep(5000);
                    System.exit(0);
                case 1:
                    System.out.println(act7.getAct7Fd());;
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 0 || optionSelected > 1);

        Act8 act8 = new Act8();
        System.out.println(act8.getAct8());

        Thread.sleep(4000);
        Act9 act9;
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pular");
        System.out.println("2 - Andar");
        System.out.println("3 - Correr");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    act9 = Act9.ACT9JUM;
                    System.out.println(act9.getText());
                    break;
                case 2:
                    act9 = Act9.ACT9WALK;
                    newCharacter.subtractHp(act9.getValue());
                    System.out.println(act9.getText());
                    newCharacter.showCharacterStats();
                    break;
                case 3:
                    act9 = Act9.ACT9RUN;
                    System.out.println(act9.getText());
                default:
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 1 || optionSelected > 3);

        Act10 act10 = new Act10();
        System.out.println(act10.getAct10());

        Thread.sleep(12000);
        Act11 act11 = new Act11();
        System.out.println(act11.getAct11());

        Thread.sleep(2000);
        Act12 act12 = new Act12();
        System.out.println(act12.getAct12());

        Thread.sleep(8000);
        Act13 act13 = new Act13();
        System.out.println(act13.getAct13());

//      Combat First Orc
        
        Double diceHeroeFirstBattle = dice.d20();
        Double diceFirstOrc = dice.d20();
        OrcAmourer firstOrc = new OrcAmourer(new Dagger("Adaga afiada", 5d), new LightArmor("Malha de metal", 5d));
        Combat combat = new Combat(firstOrc, newCharacter);
        if (diceHeroeFirstBattle > diceFirstOrc) {
            while (newCharacter.getHp() > 0 && firstOrc.getHp() > 0) {
                combat.damageAgainstHeroe(newCharacter, firstOrc, difficulty);
                combat.damageAgainstEnemys(newCharacter, firstOrc, difficulty);
            }
        } else {
            while (newCharacter.getHp() > 0 && firstOrc.getHp() > 0) {
                combat.damageAgainstEnemys(newCharacter, firstOrc, difficulty);
                combat.damageAgainstHeroe(newCharacter, firstOrc, difficulty);
            }
        }

        Act14 act14 = new Act14();
        System.out.println(act14.getAct14());

        Thread.sleep(3000);
        Act15 act15 = new Act15();
        System.out.println("Pegar nova armadura:");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    System.out.println(act15.getAct15Y());;
                    newCharacter.getArmor().addDefense(10d);
                    break;
                case 2:
                    System.out.println(act15.getAct15N());
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 1 || optionSelected > 2);

        Act16 act16 = new Act16();
        System.out.println(act16.getAct16());

        Thread.sleep(3000);
        Act17 act17 = new Act17();
        System.out.println(act17.getAct17());

        Thread.sleep(12000);
        Act18 act18 = new Act18();
        System.out.println(act18.getAct18());

//      Second Combat
        Double diceHeroeSecondBattle = dice.d20();
        Double diceSecondOrc = dice.d20();
        OrcMagician secondOrc = new OrcMagician(new Sword("Espada Curta", 5d), new LightArmor(
                "Malha de metal", 5d));
        Combat secondCombat = new Combat(secondOrc, newCharacter);
        if (diceHeroeSecondBattle > diceSecondOrc) {
            while (newCharacter.getHp() > 0 && secondOrc.getHp() > 0) {
                secondCombat.damageAgainstHeroe(newCharacter, secondOrc, difficulty);
                secondCombat.damageAgainstEnemys(newCharacter, secondOrc, difficulty);
            }
        } else {
            while (newCharacter.getHp() > 0 && secondOrc.getHp() > 0) {
                secondCombat.damageAgainstEnemys(newCharacter, secondOrc, difficulty);
                secondCombat.damageAgainstHeroe(newCharacter, secondOrc, difficulty);
            }
        }

        Act19 act19 = new Act19();
        System.out.println(act19.getAct19());

        Act20 act20 = new Act20();
        System.out.println("Tomar o líquido?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        optionSelected = scanner.nextInt();
        do {
            switch (optionSelected) {
                case 1:
                    System.out.println(act20.getAct20Drink());;
                    newCharacter.fullHeal();
                    newCharacter.showCharacterStats();
                    break;
                case 2:
                    System.out.println(act20.getAct20NDrink());
                    break;
                default:
                    System.out.println("Escolha uma opção válida:");
                    optionSelected = scanner.nextInt();
            }
        } while (optionSelected < 1 || optionSelected > 2);

        Act21 act21 = new Act21();
        System.out.println(act21.getAct21());

        Thread.sleep(5000);
        Act22 act22 = new Act22();
        System.out.println(act22.getAct22());

        Thread.sleep(3000);
        Act23 act23 = new Act23();
        System.out.println(act23.getAct23());

        Thread.sleep(2000);
        Act24 act24 = new Act24();
        System.out.println(act24.getAct24());

//      Third Combat
        Double diceHeroeThirdBattle = dice.d20();
        Double diceThirdOrc = dice.d20();
        ChiefOrc thirdOrc = new ChiefOrc(new Axe("Machado Duplo", 5d), new HeavyArmor(
                "Malha de metal", 10d));

        Combat thirdCombat = new Combat(thirdOrc, newCharacter);

        if (diceHeroeThirdBattle > diceThirdOrc) {
            while (newCharacter.getHp() > 0 && thirdOrc.getHp() > 0) {
                thirdCombat.damageAgainstHeroe(newCharacter, thirdOrc, difficulty);
                thirdCombat.damageAgainstEnemys(newCharacter, thirdOrc, difficulty);
            }
        } else {
            while (newCharacter.getHp() > 0 && thirdOrc.getHp() > 0) {
                thirdCombat.damageAgainstEnemys(newCharacter, thirdOrc, difficulty);
                thirdCombat.damageAgainstHeroe(newCharacter, thirdOrc, difficulty);
            }
        }

        Act25 act25 = new Act25();
        if (motivation.equals(act4.getAct4V())) {
            System.out.println(act25.getAct25V());
        } else {
            System.out.println(act25.getAct25G());
        }

        Thread.sleep(5000);
        Act26 act26 = new Act26();
        System.out.println(act26.getAct26());

        Thread.sleep(3000);
        Act27 act27 = new Act27();
        System.out.println(act27.getAct27());
    }
}
