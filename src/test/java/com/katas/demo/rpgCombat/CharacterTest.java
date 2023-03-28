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
}