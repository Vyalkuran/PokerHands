package com.sebastianpopa.pokerhands;

import java.util.HashMap;
import java.util.Map;

public enum CardValue {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("T", 10),
    JACK("J", 12),
    QUEEN("Q", 13),
    KING("K", 14),
    ACE("A", 15);

    public final String cardValue;
    public final int numericalValue;

    private static final Map<String, CardValue> BY_CARDVALUE = new HashMap<>();
    private static final Map<Integer, CardValue> BY_NUMERICALVALUE = new HashMap<>();

    static {
        for (CardValue cardVal : values()){
            BY_CARDVALUE.put(cardVal.cardValue, cardVal);
            BY_NUMERICALVALUE.put(cardVal.numericalValue, cardVal);
        }
    }

    CardValue(String cardValue, int numericalValue){
        this.cardValue = cardValue;
        this.numericalValue = numericalValue;
    }

    public static CardValue valueOfCardValue(String cardValue){
        return BY_CARDVALUE.get(cardValue);
    }

    public static CardValue valueOfNumericalValue(int numericalValue){
        return BY_NUMERICALVALUE.get(numericalValue);
    }
}
