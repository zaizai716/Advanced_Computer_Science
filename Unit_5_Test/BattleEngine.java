// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if ((monster.getHealth() + monster.getAttack() + monster.getDefense() + monster.getSpeed()) > 250) {
            correctStats(monster);
            return false;
        }
        if (monster.getHealth() < 0 || monster.getAttack() < 0 || monster.getDefense() < 0 || monster.getSpeed() < 0) {
            correctStats(monster);
            return false;
        }
        return true;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) return false;
        ElementType e = monster.getElement();
        boolean valid = e == ElementType.FIRE || e == ElementType.WATER || e == ElementType.EARTH || e == ElementType.AIR;
        if (!valid) {
            monster.setElement(ElementType.FIRE);
        }
        return valid;
    }

    // to-do: correctStats
    // checks if stats are invalid 
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        if (monster.getHealth() < 0) monster.setHealth(0);
        if (monster.getAttack() < 0) monster.setAttack(0);
        if (monster.getDefense() < 0) monster.setDefense(0);
        if (monster.getSpeed() < 0) monster.setSpeed(0);
        while ((monster.getHealth() + monster.getAttack() + monster.getDefense() + monster.getSpeed()) > 250) {
            if (monster.getHealth() >= monster.getAttack() && monster.getHealth() >= monster.getDefense()
                    && monster.getHealth() >= monster.getSpeed() && monster.getHealth() > 0) {
                monster.setHealth(monster.getHealth() - 1);
            } else if (monster.getAttack() >= monster.getDefense() && monster.getAttack() >= monster.getSpeed()
                    && monster.getAttack() > 0) {
                monster.setAttack(monster.getAttack() - 1);
            } else if (monster.getDefense() >= monster.getSpeed() && monster.getDefense() > 0) {
                monster.setDefense(monster.getDefense() - 1);
            } else if (monster.getSpeed() > 0) {
                monster.setSpeed(monster.getSpeed() - 1);
            } else {
                break;
            }
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking (calling attack()) the other until a monster's hp reaches 0. It returns the
    // winning monster.
    // call display status after each attack 
    // faster monster goes first
    // if they're tied in speed, then choose a random attacker
    // return winning monster, and winning monster makes victoryNoise()
    // invalid monster automatically loses, and if both are invalid, return null
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (monster1 == null || monster2 == null) {
            throw new IllegalArgumentException("Monsters cannot be null");
        }
        boolean m1Valid = validateStats(monster1) && validateElement(monster1);
        boolean m2Valid = validateStats(monster2) && validateElement(monster2);
        if (!m1Valid && !m2Valid) {
            return null;
        }
        if (!m1Valid) {
            System.out.println(monster2.victoryNoise());
            return monster2;
        }
        if (!m2Valid) {
            System.out.println(monster1.victoryNoise());
            return monster1;
        }
        Monster attacker;
        Monster defender;
        if (monster1.getSpeed() > monster2.getSpeed()) {
            attacker = monster1;
            defender = monster2;
        } else if (monster2.getSpeed() > monster1.getSpeed()) {
            attacker = monster2;
            defender = monster1;
        } else {
            if (Math.random() < 0.5) {
                attacker = monster1;
                defender = monster2;
            } else {
                attacker = monster2;
                defender = monster1;
            }
        }
        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            attacker.attack(defender);
            displayStatus(attacker, defender);
            if (defender.getHealth() <= 0) {
                break;
            }
            Monster temp = attacker;
            attacker = defender;
            defender = temp;
        }
        Monster winner = attacker.getHealth() > 0 ? attacker : defender;
        System.out.println(winner.victoryNoise());
        return winner;
    }

    // - Monster 1 vs Monster 2
    // - Reset the health of the winner to the Monsters original max health and it makes its victory noise
    // - winner fights monster 3
    // - continue through list...
    // - return final winner
    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        if (monsters == null || monsters.isEmpty()) {
            throw new IllegalArgumentException("Monster list cannot be null or empty");
        }
        if (monsters.size() == 1) {
            Monster solo = monsters.get(0);
            System.out.println(solo.victoryNoise());
            return solo;
        }
        ArrayList<Integer> originalHealth = new ArrayList<>();
        for (Monster m : monsters) {
            originalHealth.add(m.getHealth());
        }
        Monster currentWinner = monsters.get(0);
        for (int i = 1; i < monsters.size(); i++) {
            Monster challenger = monsters.get(i);
            Monster winner = startBattle(currentWinner, challenger);
            if (winner == null) {
                return null;
            }
            int index = monsters.indexOf(winner);
            if (index >= 0 && index < originalHealth.size()) {
                winner.setHealth(originalHealth.get(index));
            }
            System.out.println(winner.victoryNoise());
            currentWinner = winner;
        }
        return currentWinner;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        System.out.println(monster.getName() + ": " + monster.getHealth() + " health vs " +
                           opponent.getName() + ": " + opponent.getHealth() + " health");
    }

}
