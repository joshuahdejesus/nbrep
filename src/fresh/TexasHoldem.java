package fresh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TexasHoldem {

    static int counter = 1;
    static int count = 0;
    static String[] diamonds = new String[13];
    static String[] spades = new String[13];
    static String[] clubs = new String[13];
    static String[] hearts = new String[13];
    static String[] playerOne = new String[13];
    static String[] playerTwo = new String[13];
    static String[] playerThree = new String[13];
    static String[] playerFour = new String[13];

    static ArrayList<String> deck = new ArrayList<>();

    static void createFaces() {

        for (int i = 0; i < 13; i++) {

            diamonds[i] = counter + " of Diamonds";
            spades[i] = counter + " of Spades";
            clubs[i] = counter + " of Clubs";
            hearts[i] = counter + " of Hearts";

            counter++;

        }
    }

    static void facesToDeck() {

        deck.addAll(Arrays.asList(diamonds));
        deck.addAll(Arrays.asList(spades));
        deck.addAll(Arrays.asList(clubs));
        deck.addAll(Arrays.asList(hearts));

    }

    static void shuffleDeck() {

        Collections.shuffle(deck);

    }

    static void distributeToPlayers() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 13; j++) {

                switch (i) {
                    case 0:
                        playerOne[j] = deck.get(count);
                        break;
                    case 1:
                        playerTwo[j] = deck.get(count);
                        break;
                    case 2:
                        playerThree[j] = deck.get(count);
                        break;
                    case 3:
                        playerFour[j] = deck.get(count);
                        break;
                    default:
                        break;
                }

                count++;

            }
        }
    }

    static void printAll() {

        System.out.println("Player One: ");

        for (String playerOne1 : playerOne) {
            System.out.println(playerOne1);
        }

        System.out.println("\n\n");
        System.out.println("Player Two: ");

        for (String playerTwo1 : playerTwo) {
            System.out.println(playerTwo1);
        }

        System.out.println("\n\n");
        System.out.println("Player Three: ");

        for (String playerThree1 : playerThree) {
            System.out.println(playerThree1);
        }

        System.out.println("\n\n");
        System.out.println("Player Four: ");

        for (String playerFour1 : playerFour) {
            System.out.println(playerFour1);
        }

        System.out.println("\n\n");
    }

    public static void main(String[] args) {

        createFaces();
        facesToDeck();
        shuffleDeck();
        distributeToPlayers();
        printAll();

    }
}
