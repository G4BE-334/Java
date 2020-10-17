package UNO;

import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {

		ArrayList<Hand> hands = new ArrayList<Hand>();
		// Define the number of players n
		int n = 4;

		// Create n amount of hands
		for (int j = 0; j < n; j++) {
			hands.add(new Hand());
			hands.get(j).setScore(0);
		}

		while (hands.get(0).getScore() <= 500 && hands.get(1).getScore() <= 500 && hands.get(2).getScore() <= 500
				&& hands.get(3).getScore() <= 500) {
			Deck deck = new Deck();
			Play(deck, hands, n);
			for (int j = 0; j < n; j++) {
				System.out.println("PLAYER" + j + " SCORE: " + hands.get(j).getScore());
			}

		}

	}

	public static void Play(Deck deck, ArrayList<Hand> hands, int n) {

		deck.populate();
		deck.shuffle();
		System.out.println(deck);

		for (int i = 0; i < 7; i++) {
			for (Hand hand : hands) {
				hand.drawCard(deck.dealCard());
			}
		}

		System.out.println(hands);

		// Create new Pile to create the discard pile
		Pile discardPile = new Pile();

		boolean haveValidCard = false;
		// Draw the first card
		while (haveValidCard == false) {
			Card c = deck.dealCard();
			discardPile.playedCard(c);
			// In case the first card is a WILD Card
			// WORK ON THIS!
			// Done! :)
			if (!c.getColor().equals(cardColor.WILD)) {
				haveValidCard = true;
			} else {
				deck.addBack(c);
			}
		}

		// Show the first card
		System.out.println(discardPile);

		int flowOfGame = 1;
		boolean hasWinner = false;
		boolean lostYourFirstTurn = false;

		// Check if unfortunately the first card is an non-Wild action card
		Card firstCard = discardPile.topCard();
		if (firstCard.getValue().equals(cardValue.DRAW2)) {
			firstCard.actionDraw2(hands.get(0), deck);
			lostYourFirstTurn = true;
		} else if (firstCard.getValue().equals(cardValue.SKIP)) {
			lostYourFirstTurn = true;
		} else if (firstCard.getValue().equals(cardValue.REVERSE)) {
			flowOfGame = flowOfGame * -1;
			lostYourFirstTurn = true;
		}

		while (!hasWinner) {
			for (int i = 0; i <= n - 1;) {
				// See if lucky player 1 lost his turn
				if (lostYourFirstTurn && flowOfGame == 1) {
					i++;
					lostYourFirstTurn = false;
				} else if (lostYourFirstTurn && flowOfGame == -1) {
					i = n - 1;
					lostYourFirstTurn = false;
				}
				Hand nextPlayer = new Hand();
				// Create variable nextPlayer to help with action cards
				if (i == n - 1 && flowOfGame == 1) {
					nextPlayer = hands.get(0);
				} else if (i == 0 && flowOfGame == -1) {
					nextPlayer = hands.get(n - 1);
				} else {
					nextPlayer = hands.get(i + flowOfGame);
				}

				Card playable = hands.get(i).hasMatch(discardPile);
				// Look for a Playable card in hand
				if (playable != null) {
					// Play the card
					discardPile.playedCard(playable);
					hands.get(i).playCard(playable);

					// Verify winner after every card is played
					if (hands.get(i).isWinner()) {
						hasWinner = true;
						System.out.println("WE HAVE A WINNER! PLAYER" + i + " WON.");
						int winnerScore = 0;
						// Delete cards to not overheat java
						for (int k = 0; k < discardPile.discardedCards(); k++) {
							discardPile.reset();
						}
						for (int h = 0; h < deck.countCards(); h++) {
							deck.dealCard();
						}
						for (Hand hand : hands) {
							winnerScore = winnerScore + hand.countPoints();
							// Count point of each card
							// Winner scores the sum of points of the remaining cards
							// in other players' hands
							hand.newGame();
						}
						hands.get(i).setScore(hands.get(i).getScore() + winnerScore);
						break;
					}

					// Check for UNO player
					if (hands.get(i).UNO()) {
						System.out.println("Player" + i + " UNO!");
					}

					// Perform the action if it's an action card
					// Draw2 action
					if (playable.getValue().equals(cardValue.DRAW2)) {
						playable.actionDraw2(nextPlayer, deck);
						// Player also forfeit his/her turn
						if (flowOfGame == -1) {
							if (i == 0) {
								i = n - 1;
							} else {
								i--;
							}
						} else if (flowOfGame == 1) {
							if (i == n - 1) {
								i = 0;
							} else {
								i++;
							}
						}
					}
					// WILD Draw4 action
					else if (playable.getValue().equals(cardValue.DRAW4)) {
						playable.actionWild4(nextPlayer, hands.get(i), deck, discardPile);
						// Player also forfeit his/her turn
						if (flowOfGame == -1) {
							if (i == 0) {
								i = n - 1;
							} else {
								i--;
							}
						} else if (flowOfGame == 1) {
							if (i == n - 1) {
								i = 0;
							} else {
								i++;
							}
						}
					}
					// Wild Color action
					else if (playable.getValue().equals(cardValue.WILD)) {
						playable.actionWildColor(discardPile, hands.get(i));
					}

					// Skip action
					if (playable.getValue().equals(cardValue.SKIP)) {
						if (flowOfGame == -1) {
							if (i == 0) {
								i = n - 1;
							} else {
								i--;
							}
						} else if (flowOfGame == 1) {
							if (i == n - 1) {
								i = 0;
							} else {
								i++;
							}
						}
					}
					// Reverse action
					else if (playable.getValue().equals(cardValue.REVERSE)) {
						flowOfGame = flowOfGame * (-1);
					}
				} else {
					hands.get(i).drawCard(deck.dealCard());
					Card drawnCard = hands.get(i).hasMatch(discardPile);
					if (drawnCard != null) {
						// Play the drawn card
						discardPile.playedCard(drawnCard);
						hands.get(i).playCard(drawnCard);

						// No need to verify winner
						// But player can call UNO again
						if (hands.get(i).UNO()) {
							System.out.println("Player" + i + " UNO!");
						}
						// Perform the action if it's an action card
						// Draw2 action
						if (drawnCard.getValue().equals(cardValue.DRAW2)) {
							drawnCard.actionDraw2(nextPlayer, deck);
							// Player also forfeit his/her turn
							if (flowOfGame == -1) {
								if (i == 0) {
									i = n - 1;
								} else {
									i--;
								}
							} else if (flowOfGame == 1) {
								if (i == n - 1) {
									i = 0;
								} else {
									i++;
								}
							}
						}
						// WILD Draw4 action
						else if (drawnCard.getValue().equals(cardValue.DRAW4)) {
							drawnCard.actionWild4(nextPlayer, hands.get(i), deck, discardPile);
							// Player also forfeit his/her turn
							if (flowOfGame == -1) {
								if (i == 0) {
									i = n - 1;
								} else {
									i--;
								}
							} else if (flowOfGame == 1) {
								if (i == n - 1) {
									i = 0;
								} else {
									i++;
								}
							}
						}
						// Wild color action
						else if (drawnCard.getValue().equals(cardValue.WILD)) {
							drawnCard.actionWildColor(discardPile, hands.get(i));
						}

						// Skip action
						else if (drawnCard.getValue().equals(cardValue.SKIP)) {
							if (flowOfGame == -1) {
								if (i == 0) {
									i = n - 1;
								} else {
									i--;
								}
							}
							if (flowOfGame == 1) {
								if (i == n - 1) {
									i = 0;
								} else {
									i++;
								}
							}
						}
						// Reverse action
						else if (drawnCard.getValue().equals(cardValue.REVERSE)) {
							flowOfGame = flowOfGame * (-1);
						}
					}
				}
				i = i + flowOfGame;

				// Check if i goes out the boundaries of loop (0-3)
				if (i < 0) {
					i = n - 1;
				}

				// Do with <= 10 to avoid bugs
				if (deck.countCards() <= 10) {
					for (int j = 0; j < discardPile.discardedCards() - 1; j++) {
						deck.replenish(discardPile);
					}
					deck.shuffle();
				}

				// Print state of the Game
				System.out.println(hands);
				System.out.println(discardPile);
			}
		}
	}
}