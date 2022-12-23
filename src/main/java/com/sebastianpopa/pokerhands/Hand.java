package com.sebastianpopa.pokerhands;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public class Hand {

    private HashMap<Integer, Card> cards;

    public Hand() {
        this.cards = new HashMap<>();
    }

    public void addCard(Card card) throws Exception {
        if(cards.size()==5){
            throw new Exception("You cannot have more than 5 cards in you hand");
        }
        if(cards.containsValue(card)){
            throw new Exception("It's impossible to have two of the same card in play, check your deck and remove duplicates!");
        }
        cards.put(cards.size()+1, card);
    }
}
