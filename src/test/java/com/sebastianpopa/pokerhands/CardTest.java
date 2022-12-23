package com.sebastianpopa.pokerhands;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CardTest {
    @Test
    public void createCardTest(){
        String cardAsString = "8C";
        Card card = CardHandler.generateCard(cardAsString);
        assertEquals(card.getValue().numericalValue, 8);
        assertEquals(card.getSuit().name(), "CLUBS");
    }

    @Test
    public void compareTwoCards(){
        String card1String = "8C";
        String card2String = "9C";
        String card3String = "9C";
        String card4String = "9D";
        Card card1 = CardHandler.generateCard(card1String);
        Card card2 = CardHandler.generateCard(card2String);
        Card card3 = CardHandler.generateCard(card3String);
        Card card4 = CardHandler.generateCard(card4String);
        assertTrue(card1.compareTo(card2) < 0);
        assertEquals(card2, card3);
        assertTrue(card3.compareTo(card4) < 0);
    }
}
