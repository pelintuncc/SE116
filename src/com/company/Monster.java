package com.company;

public class Monster {
    public Hero hero;
    private String name;
    private int healthPoints, attackSpeed, attackDamage;
    private String specialities;

    public Monster(String name, int healthPoints, int attackSpeed, int attackDamage, String specialities) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.specialities = specialities;
    }


    public Monster() {
        this.name = null;
        this.healthPoints = 0;
        this.attackSpeed = 0;
        this.attackDamage = 0;
        this.specialities = null;
    }


    public int attackToHero(Hero hero) {
        int currentHeroHealth;
        int reducedDamage;
        System.out.println("You have been attacked by monster!");
        int attackDamage = getAttackDamage();
        int attackSpeed = getAttackSpeed();
        int attack = attackDamage * attackSpeed;

        if(attack<hero.getArmor()){
            reducedDamage=hero.getArmor()-attack;

        }
        else{
            reducedDamage=attack-hero.getArmor();

        }
        currentHeroHealth=hero.getHealthPoints()-reducedDamage;
        hero.setHealthPoints(currentHeroHealth);
        return currentHeroHealth;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getSpecialities() {
        return specialities;
    }


    public void displayInfo() {
        System.out.println("Health Points: " + healthPoints + "\nAttack Speed: " + attackSpeed + "\nAttack Damage: " + attackDamage  + "\nSpecialities: " + specialities);
    }
}
