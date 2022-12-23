package com.sebastianpopa.pokerhands;

public class CardHandler {
    public static Card generateCard(String cardAsString){
        return new Card(CardValue.valueOfCardValue(cardAsString.substring(0, 1)), Suit.valueOfSuit(cardAsString.substring(1)));
    }
}
