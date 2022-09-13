import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem54 {


    public static int[] orderedCardValues = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 1};

    class CardDeck {
        public ArrayList<Card> cards = new ArrayList<>();
    }

    class Card {
        // pkg access
        String color;
        String suit;
        String value;

        public Card(String str) {
            // e.g., "BLACK|SPADE|2"
            String[] a = str.split("|");

            this.color = a[0];
            this.suit = a[1];
            this.value = a[2];
        }
    }
    
    public class PokerHand {

        public PokerHand(String hand) {

        }
    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();

        try {
            for (String str : cardDeckDataSet) {
                cardStr.split("|");
            }
            String[] cardProps;
            for (int i = 0; i < 52; i++) {
                cardProps = cardDeckDataSet[i].split("|");
                CardDeck52.cards[i] = new Card(cardProps[1], cardProps[0], cardProps[2]);

            }

            // pass the path to the file as a parameter
            File file = new File("C:\\Users\\Adnan.QSSBH\\CodeTestPreparation\\ProjectEuler\\Problem54\\p054_poker.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
    }
    
    public static String[] cardDeckDataSet = new String[] {
        "BLACK|SPADE|2"
        ,"BLACK|SPADE|3"
        ,"BLACK|SPADE|4"
        ,"BLACK|SPADE|5"
        ,"BLACK|SPADE|6"
        ,"BLACK|SPADE|7"
        ,"BLACK|SPADE|8"
        ,"BLACK|SPADE|9"
        ,"BLACK|SPADE|10"
        ,"BLACK|SPADE|J"
        ,"BLACK|SPADE|Q"
        ,"BLACK|SPADE|K"
        ,"BLACK|SPADE|A"
        ,"BLACK|CLUB|2"
        ,"BLACK|CLUB|3"
        ,"BLACK|CLUB|4"
        ,"BLACK|CLUB|5"
        ,"BLACK|CLUB|6"
        ,"BLACK|CLUB|7"
        ,"BLACK|CLUB|8"
        ,"BLACK|CLUB|9"
        ,"BLACK|CLUB|10"
        ,"BLACK|CLUB|J"
        ,"BLACK|CLUB|Q"
        ,"BLACK|CLUB|K"
        ,"BLACK|CLUB|A"
        ,"RED|DIAMOND|2"
        ,"RED|DIAMOND|3"
        ,"RED|DIAMOND|4"
        ,"RED|DIAMOND|5"
        ,"RED|DIAMOND|6"
        ,"RED|DIAMOND|7"
        ,"RED|DIAMOND|8"
        ,"RED|DIAMOND|9"
        ,"RED|DIAMOND|10"
        ,"RED|DIAMOND|J"
        ,"RED|DIAMOND|Q"
        ,"RED|DIAMOND|K"
        ,"RED|DIAMOND|A"
        ,"RED|HEART|2"
        ,"RED|HEART|3"
        ,"RED|HEART|4"
        ,"RED|HEART|5"
        ,"RED|HEART|6"
        ,"RED|HEART|7"
        ,"RED|HEART|8"
        ,"RED|HEART|9"
        ,"RED|HEART|10"
        ,"RED|HEART|J"
        ,"RED|HEART|Q"
        ,"RED|HEART|K"
        ,"RED|HEART|A"
    };
}
