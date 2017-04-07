package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.HashCode;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null) throw new IllegalArgumentException();
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return rank.equals(card.rank) && suit.equals(card.suit);
    }

    @Override
    public int hashCode(){
        return rank.hashCode();
    }


}
