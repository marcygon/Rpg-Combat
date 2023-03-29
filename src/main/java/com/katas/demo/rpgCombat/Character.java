package com.katas.demo.rpgCombat;

public class Character {
    private Long health = 960L;
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
    public void heals(Character character, Boolean isAlive){
        if(isAlive == true){
            character.heal(this.health);
        }
    }
    public void heal(Long health){
        if(health >= 1 && health <= 950){
            Long newHealth = this.health + 50L;
            if(newHealth <= 950L){
                this.health = newHealth;
            } else {
                this.health = health;
            }
        }
    }
}
