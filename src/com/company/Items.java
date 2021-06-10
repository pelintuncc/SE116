package com.company;

import java.util.ArrayList;

public class Items {
    Hero hero;
    private String name;
    private String upgradeType;
    private int damageUpgradeValue;
    private int speedUpgradeValue;
    private int armorUpgradeValue;
    private int healthUpgradeValue;
    private String specialities;
    private ArrayList<Items> itemList=new ArrayList<Items>();


    public Items(String name, String upgradeType, int damageUpgradeValue, int speedUpgradeValue, int armorUpgradeValue, int healthUpgradeValue, String specialities) {
        this.name = name;
        this.upgradeType = upgradeType;
        this.damageUpgradeValue = damageUpgradeValue;
        this.speedUpgradeValue = speedUpgradeValue;
        this.armorUpgradeValue = armorUpgradeValue;
        this.healthUpgradeValue = healthUpgradeValue;
        this.specialities = specialities;

    }

    public Items() {
        this.name = null;
        this.upgradeType = null;
        this.damageUpgradeValue = 0;
        this.speedUpgradeValue = 0;
        this.armorUpgradeValue = 0;
        this.healthUpgradeValue = 0;
        this.specialities = null;

    }


    public void upgrade(Items items) {
        int currentAttackDamage = hero.getAttackDamage() + items.damageUpgradeValue;
        int currentAttackSpeed = hero.getAttackSpeed() + items.speedUpgradeValue;
        int currentArmor = hero.getArmor() + items.armorUpgradeValue;
        int currentHealthPoint = hero.getHealthPoints() + items.healthUpgradeValue;
        hero.setAttackDamage(currentAttackDamage);
        hero.setAttackDamage(currentAttackSpeed);
        hero.setArmor(currentArmor);
        hero.setHealthPoints(currentHealthPoint);

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    public void setDamageUpgradeValue(int damageUpgradeValue) {
        this.damageUpgradeValue = damageUpgradeValue;
    }

    public void setSpeedUpgradeValue(int speedUpgradeValue) {
        this.speedUpgradeValue = speedUpgradeValue;
    }

    public void setArmorUpgradeValue(int armorUpgradeValue) {
        this.armorUpgradeValue = armorUpgradeValue;
    }

    public void setHealthUpgradeValue(int healthUpgradeValue) {
        this.healthUpgradeValue = healthUpgradeValue;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    public void setItemList(ArrayList<Items> itemList) {
        this.itemList = itemList;
    }
}
