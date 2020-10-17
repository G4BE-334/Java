package UNO;

public class Card {

	public Card(cardValue value, cardColor color) {
		super();
		this.value = value;
		this.color = color;
	}

	public cardValue getValue() {
		return value;
	}

	public void setValue(cardValue value) {
		this.value = value;
	}

	public cardColor getColor() {
		return color;
	}

	public void setColor(cardColor color) {
		this.color = color;
	}

	public void actionDraw2(Hand hand, Deck deck) {
		hand.drawCard(deck.dealCard());
		hand.drawCard(deck.dealCard());
	}

	public void actionWild4(Hand caster, Hand target, Deck deck, Pile discardPile) {
		target.drawCard(deck.dealCard());
		target.drawCard(deck.dealCard());
		target.drawCard(deck.dealCard());
		target.drawCard(deck.dealCard());
		// Generate a random number to be used in the random choice of color
		// Improved to pick bestColor
		discardPile.topCard().setColor(caster.bestColor());
	}

	public void actionWildColor(Pile discardPile, Hand caster) {
		// For now this will pick a color at random
		// Improve to pick the bestColor based on the player's hand
		// Improved!
		discardPile.topCard().setColor(caster.bestColor());
	}

	// public

	private cardValue value;
	private cardColor color;

	@Override
	public String toString() {
		return color + " " + value;
	}

}
