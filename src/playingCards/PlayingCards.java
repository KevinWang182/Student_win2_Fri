package playingCards;

public class PlayingCards {

    public static void main(String[] args) {
        System.out.println("Playing Cards");
	Deck deck = new Deck();
	deck.create();
        deck.showCards();
        
//	System.out.println("Sorted cards");
//	deck.sort();
//	deck.showCards();

	System.out.println("Shuffled cards");
	deck.shuffle();
	deck.showCards();
        
        // Moved sort to end since deck is created already sorted
        System.out.println("Sorted cards");
	deck.sort();
	deck.showCards();
    }
    
}
