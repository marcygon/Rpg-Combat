package com.katas.demo.rpgCombat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void characterStarterStatus(){
        var spiderman = new Character();
        assertEquals(1000L, spiderman.getHealth());
        assertEquals(1L, spiderman.getLevel());
        assertEquals(true, spiderman.isAlive());
    }
    @Test
    void healthAffectedByDamage(){
        var victim = new Character();
        var aggressor = new Character();
        aggressor.attacks(victim, 100L);
        assertEquals(900, victim.getHealth());
    }
    @Test
    void ifDamageIsBiggerThanHealthCharacterDies(){
        var victim = new Character();
        var aggressor = new Character();
        aggressor.attacks(victim, 1020L);
        assertEquals(0, victim.getHealth());
    }
    @Test
    void characterHealsCharacter(){
        var character1 = new Character();
        var character2 = new Character();
        character1.heals(character2, true);
        assertEquals(960L, character2.getHealth());
    }






}