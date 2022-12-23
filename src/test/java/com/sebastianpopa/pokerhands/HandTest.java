package com.sebastianpopa.pokerhands;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HandTest {

    @Test
    public void addFiveCardsToHand() throws Exception {
        FileReader f = new FileReader("src/main/resources/static/p054_poker.txt");
        RoundReader roundReader = new RoundReader(f);
        Round round = new Round(roundReader.getRound());
        Hand hand = round.dealCards();
        assertEquals(hand.getCards().size(), 5);
        for(Card c : hand.getCards().values()){
            System.out.println(c.getValue() + " " + c.getSuit());
        }
    }
}
