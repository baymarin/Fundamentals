package Fundamentals.FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> heroAndHP = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> heroAndMP = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String currentHero = scanner.nextLine();
            String heroName = currentHero.split(" ")[0];
            int heroHP = Integer.parseInt(currentHero.split(" ")[1]);
            int heroMP = Integer.parseInt(currentHero.split(" ")[2]);

            heroAndHP.put(heroName, heroHP);
            heroAndMP.put(heroName, heroMP);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split(" - ");
            String heroName = tokens[1];
            switch (tokens[0]) {
                case "CastSpell":
                    String spellName = tokens[3];
                    int MPNeeded = Integer.parseInt(tokens[2]);
                    int currentMP = heroAndMP.get(heroName);

                    if (MPNeeded > currentMP) {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    } else {
                        currentMP -= MPNeeded;
                        heroAndMP.put(heroName, currentMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName,
                                currentMP);
                    }

                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentHp = heroAndHP.get(heroName);
                    currentHp -= damage;
                    if (currentHp <= 0) {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroAndHP.remove(heroName);
                        heroAndMP.remove(heroName);
                    } else {
                        heroAndHP.put(heroName, currentHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage,
                                attacker, currentHp);
                    }

                    break;
                case "Recharge":
                    int MPRecharge = Integer.parseInt(tokens[2]);
                    int MP = heroAndMP.get(heroName);
                    int upgradedMP = MP + MPRecharge;

                    if (upgradedMP > 200) {
                        heroAndMP.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - MP);
                    } else {
                        heroAndMP.put(heroName, upgradedMP);
                        System.out.printf("%s recharged for %d MP!%n", heroName, MPRecharge);
                    }

                    break;
                case "Heal":
                    int HPRecharge = Integer.parseInt(tokens[2]);
                    int HP = heroAndHP.get(heroName);
                    int upgradedHP = HP + HPRecharge;

                    if (upgradedHP > 100) {
                        heroAndHP.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - HP);
                    } else {
                        heroAndHP.put(heroName, upgradedHP);
                        System.out.printf("%s healed for %d HP!%n", heroName, HPRecharge);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String s : heroAndMP.keySet()) {
            int currentMP = heroAndMP.get(s);
            int currentHP = heroAndHP.get(s);

            System.out.printf("%s%n  HP: %d%n  MP: %d%n", s, currentHP, currentMP);
        }
    }
}
