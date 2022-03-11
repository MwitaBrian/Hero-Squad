package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void classGetsInstantiatedCorrectly(){
        Hero hero =  new Hero("Mwita", 24, "Vibranium Strength", "cyanide");
        assertTrue(hero instanceof Hero);
    }

    @Test
    void allHeroInstancesGetReturnedSuccessfully(){
        Hero hero = new Hero("Mwita", 24, "Kindness","Complicated");
        Hero hero1 = new Hero("Spiderman", 34, "Spider webs", "Mary Jane");
        assertEquals(2, Hero.getAll().size());
    }

}