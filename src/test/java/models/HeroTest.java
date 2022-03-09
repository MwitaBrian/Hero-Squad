package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void classGetsInstantiatedCorrectly(){
        Hero hero =  new Hero("Mwita", 24, "Vibranium Strength", "cyanide");
        assertTrue(hero instanceof Hero);
    }

}