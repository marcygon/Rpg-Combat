package com.katas.demo.rpgCombat;

public class Character {
    private Long health = 1000L;
    private Long level = 1L;
    private Boolean alive = true;

    public Long getHealth() {
        return this.health;
    }
    public long getLevel() {
        return this.level;
    }
    public boolean isAlive() {
        return this.alive;
    }

    public void attacks(Character victim, Long damage) {
        victim.damage(damage);
    }

    public void damage(Long damage){
        if(this.health < damage){
            this.health = 0L;
            this.alive = false;
            return;
        }
        this.health -= damage;
    }
}
