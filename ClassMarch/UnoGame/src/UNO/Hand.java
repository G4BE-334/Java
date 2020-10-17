package UNO;

import java.util.ArrayList;

public class Hand {

	public void drawCard(Card card) {

		hand.add(card);

	}

	// Look for a match in the hand
	public Card hasMatch(Pile discardPile) {
		// Verify if the card matches color or value
		for (Card c : hand) {
			if (c.getValue() == discardPile.topCard().getValue() && c.getValue() != cardValue.DRAW2
					&& c.getValue() != cardValue.REVERSE && c.getValue() != cardValue.SKIP) {
				// Prioritize playing number cards before action cards
				return c;
			}
		}
		for (Card c : hand) {
			if (c.getColor() == discardPile.topCard().getColor() && c.getValue() != cardValue.DRAW2
					&& c.getValue() != cardValue.REVERSE && c.getValue() != cardValue.SKIP) {
				return c;
			}
		}
		for (Card c : hand) {
			if (c.getValue() == discardPile.topCard().getValue() || c.getColor() == discardPile.topCard().getColor()) {
				// Play matching action card
				return c;
			}
		}
		for (Card c : hand) {
			if (c.getColor().equals(cardColor.WILD)) {
				// Check if there is a WILD card in the hand that can be played
				return c;
			}
		}
		return null;
	}

	public cardColor bestColor() {
		int Y = 0;
		int R = 0;
		int B = 0;
		int G = 0;
		for (Card c : hand) {
			if (c.getColor() == cardColor.YELLOW) {
				Y++;
			}
		}
		for (Card c : hand) {
			if (c.getColor() == cardColor.RED) {
				R++;
			}
		}
		for (Card c : hand) {
			if (c.getColor() == cardColor.BLUE) {
				B++;
			}
		}
		for (Card c : hand) {
			if (c.getColor() == cardColor.GREEN) {
				G++;
			}
		}
		if (Y >= R && Y >= B && Y >= G) {
			return cardColor.YELLOW;
		}
		if (R >= Y && R >= B && R >= G) {
			return cardColor.RED;
		}
		if (B >= Y && B >= R && B >= G) {
			return cardColor.BLUE;
		}
		if (G >= Y && G >= R && G >= B) {
			return cardColor.GREEN;
		}
		return cardColor.RED;
	}

	public void playCard(Card c) {
		hand.remove(c);
	}

	public boolean isWinner() {
		if (hand.size() == 0) {
			return true;
		}
		return false;
	}

	public boolean UNO() {
		if (hand.size() == 1) {
			return true;
		}
		return false;
	}

	public void newGame() {
		for (int i = 0; i < hand.size(); i++) {
			hand.remove(i);
		}
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int Score) {
		this.Score = Score;
	}

	private ArrayList<Card> hand = new ArrayList<Card>();

	private int Score;

	public int countPoints() {
		int x = 0;
		for (Card c : hand) {
			if (c.getValue().equals(cardValue.ONE)) {
				x = x + 1;
			}
			if (c.getValue().equals(cardValue.TWO)) {
				x = x + 2;
			}
			if (c.getValue().equals(cardValue.THREE)) {
				x = x + 3;
			}

			if (c.getValue().equals(cardValue.FOUR)) {
				x = x + 4;
			}
			if (c.getValue().equals(cardValue.FIVE)) {
				x = x + 5;
			}
			if (c.getValue().equals(cardValue.SIX)) {
				x = x + 6;
			}
			if (c.getValue().equals(cardValue.SEVEN)) {
				x = x + 7;
			}
			if (c.getValue().equals(cardValue.EIGHT)) {
				x = x + 8;
			}
			if (c.getValue().equals(cardValue.NINE)) {
				x = x + 9;
			}
			if (c.getValue().equals(cardValue.SKIP) || c.getValue().equals(cardValue.DRAW2)
					|| c.getValue().equals(cardValue.REVERSE)) {
				x = x + 20;
			}
			if (c.getColor().equals(cardColor.WILD)) {
				x = x + 50;
			}
		}
		return x;
	}

	@Override
	public String toString() {
		return hand + "]\n";
	}

}
