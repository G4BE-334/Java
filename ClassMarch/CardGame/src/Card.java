
public class Card {
	
	public Card(CardValue value, CardSuit suit) {
		super();
		this.value = value;
		this.suit = suit;
	}
	public CardValue getValue() {
		return value;
	}
	public void setValue(CardValue value) {
		this.value = value;
	}
	public CardSuit getSuit() {
		return suit;
	}
	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	
	private CardValue value;
	private CardSuit suit;
	@Override
	public String toString() {
		return value + "of" + suit;
	}
	
	
}
