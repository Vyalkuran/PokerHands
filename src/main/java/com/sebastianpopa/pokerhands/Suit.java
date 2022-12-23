package com.sebastianpopa.pokerhands;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    public final String suit;

    private static final Map<String, Suit> BY_SUIT = new HashMap<>();

    static {
        for (Suit s : values()){
            BY_SUIT.put(s.suit, s);
        }
    }

    Suit(String suit) {
        this.suit = suit;
    }

    public static Suit valueOfSuit(String suit){
        return BY_SUIT.get(suit);
    }
}
