package com.sebastianpopa.pokerhands;

import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
public class Round{
    private Queue<Card> cards;

    public Round(String cardsDrawn) {
        cards = new LinkedList<>(addCardsToQueue(cardsDrawn));
    }

    private List<Card> addCardsToQueue(String cardsDrawn){
        List<String> x = Arrays.asList(cardsDrawn.split(" "));
        return x.stream().map(CardHandler::generateCard).toList();
    }

    public Hand dealCards() throws Exception {
        Hand hand = new Hand();
        int i = 0;
        while(i<5){
            hand.addCard(cards.poll());
            i++;
        }
        return hand;
    }
}
