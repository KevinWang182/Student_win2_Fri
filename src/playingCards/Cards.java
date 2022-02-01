package playingCards;

public abstract class Cards {
    protected Card[] card = new Card[52]; // 52 card deck
    
    // Card array accessor
    abstract Card[] getCard();
}
