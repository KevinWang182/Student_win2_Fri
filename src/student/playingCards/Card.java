package student.playingCards;

public class Card implements Comparable<Card>{
    private int suit, rank;

    // Constructor
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    // Compare
    @Override
    public int compareTo(Card c) {
        return suit > c.suit ? 1 : // c suit greater than this suit : return 1
                suit < c.suit ? -1 : // Else if c suit lesser : return -1
                rank > c.rank ? 1 : // Both suits are same : compare ranks
                rank < c.rank ? -1 : 0; // Both ranks are same : return 0
    }
    
    // Convert card to string
    @Override
    public String toString() {
        String c;
        
        c = switch(rank) {
            case 1 -> "A"; // Ace
            case 11 -> "J"; // Jack
            case 12 -> "Q"; // Queen
            case 13 -> "K"; // King
            default -> String.valueOf(rank);
        };
        return switch(suit) {
            case 0 -> c + "d"; // Diamonds (smallest)
            case 1 -> c + "c"; // Clubs
            case 2 -> c + "h"; // Hearts
            default -> c + "s"; // Spades (largest)
        };
    }
}
