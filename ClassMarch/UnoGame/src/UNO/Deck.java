package UNO;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	public Deck() {

		super();
		deck = new ArrayList<Card>();

	}

	public void populate() {
		for (int i = 0; i < 4; i++) {

			for (int x = 0; x < 10; x++) {

				deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
				deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
				if (x == 9) {
					x++;
					while (x < 13) {
						deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
						deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
						x++;
					}

				}
			}
			if (i == 3) {
				i++;
				for (int x = 13; x < 15; x++) {
					deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
					deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
					deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));
					deck.add(new Card(cardValue.values()[x], cardColor.values()[i]));

				}
			}
		}

	}

	public void shuffle() {
		Collections.shuffle(deck);

	}

	public int countCards() {
		return deck.size();
	}

	public void addBack(Card c) {
		deck.add(deck.size(), c);
	}

	public Card dealCard() {
		return deck.remove(deck.size() - 1);

	}

	// Reset the deck when there are no more cards on it
	// Do with <= 10 to avoid bugs
	public void replenish(Pile discardPile) {
		deck.add(discardPile.reset());
	}

	private ArrayList<Card> deck;

	@Override
	public String toString() {
		return deck + "\n";
	}

}
