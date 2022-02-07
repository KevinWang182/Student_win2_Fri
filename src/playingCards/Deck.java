package playingCards;

public class Deck extends Cards{
    private Card[] deck;
    
    @Override
    public Card[] getCard() {
        return card;
    }
    
    // Create new deck;
    public void create() {
        deck = getCard();
        
        // Give each card a suit & rank in order
        for(int suit = 0; suit < 4; suit++)
            for(int rank = 0; rank < 13; rank++)
                deck[suit * 13 + rank] = new Card(suit, rank + 1);
    }
    
    public void sort() {
        Card t; // Temp var
        
        // Bubble sort(too lazy to do more efficent sorting methods)
        for(int i = 0; i < deck.length; i++)
            for(int j = i + 1; j < deck.length; j++)
                if(deck[i].compareTo(deck[j]) > 0) {
                    
                    // Swap
                    t = deck[i];
                    deck[i] = deck[j];
                    deck[j] = t;
                }
        
        /** 
         * Since the deck was already sorted when it was created and it's values
         * are fixed, it's probably better to simply recreate the array rather
         * than sorting it in this case.
         */
    }
    
    public void shuffle() {
        
        // Temporary array to store shuffled cards
        Card[] shuffled = new Card[52]; 
        
        // boolean array to indicate if index in the shuffled array has already 
        // been used
        boolean[] used = new boolean[52]; 
        int randNum;
        
        for(Card c : deck) {
            do 
                randNum = (int)(Math.random() * 52);
            while(used[randNum]); // Loop until on index not already used
            used[randNum] = true;
            shuffled[randNum] = c;
        }
        
        deck = shuffled;
    }
    
    public void showCards() {
        String deckStr = "";
        int i = 1;
                
        for(Card c : deck) {
            deckStr += String.format("%4s", c);
            if(i % 13 == 0)
                deckStr += "\n"; // New line after 13 cards
            i++;
        }
        
        System.out.println(deckStr);
    }
}
