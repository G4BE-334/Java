package UNO;
// New class Pile

import java.util.ArrayList;

public class Pile {

	public void playedCard(Card c) {
		pile.add(c);
	}

	public ArrayList<Card> pile = new ArrayList<Card>();

	public Card topCard() {
		return pile.get(pile.size() - 1);
	}

	public Card reset() {
		return pile.remove(pile.size() - 1);
	}

	public int discardedCards() {
		return pile.size();
	}

	public ArrayList<Card> getPile() {
		return pile;
	}

	public void setPile(ArrayList<Card> pile) {
		this.pile = pile;
	}

	// Generate toString to make the pile visible
	@Override
	public String toString() {
		return pile + "\n";
	}

}
