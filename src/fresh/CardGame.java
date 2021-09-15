package fresh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {

    int value;
    String face;

    public Card() {

    }

    public Card(int value, String face) {
        this.value = value;
        this.face = face;

    }
}

public class CardGame {

    int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    String[] face = {"Diamonds", "Spades", "Clubs", "Hearts"};
    Card[] diamonds = new Card[13];
    Card[] spades = new Card[13];
    Card[] clubs = new Card[13];
    Card[] hearts = new Card[13];
    List<Card> diamond = new ArrayList<>();
    List<Card> spade = new ArrayList<>();
    List<Card> club = new ArrayList<>();
    List<Card> heart = new ArrayList<>();
    List<Card> fullDeck = new ArrayList<>();
    Card[] playerOne = new Card[5];
    Card[] playerTwo = new Card[5];
    Card[] playerThree = new Card[5];
    Card[] playerFour = new Card[5];

    public void buildDeck() {

        for (int i = 0; i < face.length; i++) {

            for (int j = 0; j < value.length; j++) {

                switch (i) {
                    case 0:
                        diamonds[j] = new Card(value[j], face[i]);

                        break;
                    case 1:
                        spades[j] = new Card(value[j], face[i]);
                        break;
                    case 2:
                        clubs[j] = new Card(value[j], face[i]);
                        break;
                    case 3:
                        hearts[j] = new Card(value[j], face[i]);
                        break;
                }
            }
        }

        Collections.addAll(diamond, diamonds);
        Collections.addAll(spade, spades);
        Collections.addAll(club, clubs);
        Collections.addAll(heart, hearts);

        fullDeck.addAll(diamond);
        fullDeck.addAll(spade);
        fullDeck.addAll(club);
        fullDeck.addAll(heart);

    }

    public void shuffleDeck() {

        Collections.shuffle(diamond);
        Collections.shuffle(spade);
        Collections.shuffle(club);
        Collections.shuffle(heart);
        Collections.shuffle(fullDeck);
    }

    public void printDecks() {

        diamond.forEach(i -> {
            System.out.println(i.value + " of " + i.face);
        });

        spade.forEach(i -> {
            System.out.println(i.value + " of " + i.face);
        });
        club.forEach(i -> {
            System.out.println(i.value + " of " + i.face);
        });

        heart.forEach(i -> {
            System.out.println(i.value + " of " + i.face);
        });
    }

    public void disrtribute() {

        int counter = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                switch (i) {
                    case 0:
                        playerOne[j] = new Card(fullDeck.get(counter).value, fullDeck.get(counter).face);
                        counter++;
                        break;

                    case 1:
                        playerTwo[j] = new Card(fullDeck.get(counter).value, fullDeck.get(counter).face);
                        counter++;
                        break;

                    case 2:

                        playerThree[j] = new Card(fullDeck.get(counter).value, fullDeck.get(counter).face);
                        counter++;
                        break;

                    case 3:
                        playerFour[j] = new Card(fullDeck.get(counter).value, fullDeck.get(counter).face);
                        counter++;
                        break;
                }
            }
        }
    }
    
    public void playTheGame(){
        
        for (int i = 0; i < playerOne.length; i++) {

            if (playerOne[i].value == playerTwo[i].value){
                
                System.out.println("same value");
            }else if (playerOne[i].value >= playerTwo[i].value){
                
                System.out.println("Player One Win!");
            }else{
                System.out.println("Player Two Wins!");
            }
        }
    }

    public static void main(String[] args) {

        CardGame cg = new CardGame();
        cg.buildDeck();
        cg.shuffleDeck();
        cg.disrtribute();
        cg.playTheGame();
        //cg.printDecks();
    }
}
