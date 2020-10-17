import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	public Deck() {
	
		super();
		deck = new ArrayList<Card>();
		
	}
	
	public void ploriferate() {
		for(CardSuit suit: CardSuit.values()) {
			
			for(CardValue value: CardValue.values()) {
				
				deck.add(new Card(value, suit));
			}
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
		
	}
	
	public Card dealCard() {

		return deck.remove(deck.size()-1);
		
	}
	private ArrayList<Card> deck;
	@Override
	public String toString() {
		return deck + "\n";
	}
	
	
}
