package org.example;

public enum Weapon {
    SWORD(30,0.7),BOW(20,0.9),MACE(40,0.4);


        private final int damage;
        private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
        }


        public double getAttackSpeed() {
        return attackSpeed;
        }


}
