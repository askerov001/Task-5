package com.askerov;

public class Boss {
    private int health = 1000;
    private int damage;
    private String superDefense = "Invisible";

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperDefense() {
        return superDefense;
    }

    public void setSuperDefense(String superDefense) {
        this.superDefense = superDefense;

    }
    public void printInfo(){
        System.out.println("Health:" + health + "Damage" + damage + "Super power" + superDefense);
    }
}
