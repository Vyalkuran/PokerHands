package com.sebastianpopa.pokerhands;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Card implements Comparable<Card>{
    private CardValue value;
    private Suit suit;

    @Override
    public int compareTo(Card c) {
        if (value.compareTo(c.value) == 0){
            return suit.compareTo(c.suit);
        }
        return value.compareTo(c.value);
    }
}
