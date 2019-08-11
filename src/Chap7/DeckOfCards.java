package Chap7;
//Represents a deck of cards

import java.security.SecureRandom;

public class DeckOfCards {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

    private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
    private int currentCard = 0; // index of next Card to be dealt (0-51)

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Build deck
        for (int count = 0; count < deck.length; count++) {
            deck[count] =
                    new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            // Random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // Swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {

        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null; // All cards were dealt
        }
    }
}