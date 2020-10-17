import java.util.ArrayList;

public class Hand {
	
	public void drawCard(Card card) {
		
		hand.add(card);
		
	}
	
	private ArrayList<Card> hand = new ArrayList<Card>();

	@Override
	public String toString() {
		return  hand + "]\n";
	}
	
}
