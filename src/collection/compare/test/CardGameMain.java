package collection.compare.test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CardGameMain {
    public static void main(String[] args) {
        ArrayList<Card> Deck = gameStart();

        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            player1.add(drawCard(Deck));
            player2.add(drawCard(Deck));
        }
        player1.sort(null);
        player2.sort(null);

        int player1Score = 0;
        int player2Score = 0;
        for (int i = 0; i < 5; i++) {
            Card card1 = player1.get(i);
            Card card2 = player2.get(i);
            player1Score+=card1.getNumber();
            player2Score+=card2.getNumber();
        }



        System.out.println("player1 의 카드:  " + player1+", 합계 : "+player1Score);
        System.out.println("player2 의 카드:  " + player2+", 합계 : "+player2Score);
        String result = player1Score > player2Score ? "player1 승리" : (player1Score < player2Score) ? "player2 승리" : "무승부";
        System.out.println(result);


    }

    private static Card drawCard(ArrayList<Card> deck) {
         return deck.remove(0);
    }

    private static ArrayList gameStart() {
        ArrayList<Card> Deck = new ArrayList<>();
//        System.out.println(Shape.CLUB);
        for (int i = 1; i <=13 ; i++) {
                Deck.add(new Card(Shape.SPADE,i));
                Deck.add(new Card(Shape.HEART,i));
                Deck.add(new Card(Shape.DIAMOND,i));
                Deck.add(new Card(Shape.CLUB,i));
        }

        System.out.println(Deck);
        Collections.shuffle(Deck);

        return Deck;
    }
}
