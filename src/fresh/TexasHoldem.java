package fresh;

import java.util.HashMap;

public class TexasHoldem {

    static void populateDeck() {

        String[] faces = {"Diamond", "Spades", "Clubs", "Hearts"};
        int counter;
        
        HashMap<Integer, String> deck = new HashMap();
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 13; j++) {

                switch (i) {
                    case 0:
                        deck.putIfAbsent(j, faces[i]);
                        break;
                    case 1:
                        deck.putIfAbsent(j, faces[i]);
                        break;
                }                
            }
        }
        
        for (int i = 0; i < 20; i++) {
            
            System.out.println(deck.get(i));
        }
    }

    public static void main(String[] args) {

        populateDeck();

    }
}
