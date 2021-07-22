package edu.cnm.deepdive.playingcards.model;

import edu.cnm.deepdive.general.model.Hand;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class BlackjackComparator extends Rank implements Comparator<Hand<Card>>  {

  public Card(Rank rank) {
    this.rank = rank;
  }

  Hand<Integer> hand1 = new Hand<>();
  Hand<Integer> hand2 = new Hand<>();

  private static List<Card> getHand1(Random rng) {
    List<Card> hand1 = new ArrayList<>();
    for (Rank rank : Rank.values()) {
      hand1.add(new <Card>(rank));
    }
    Collections.shuffle(hand1, rng);
    return hand1;
  }

}


  @Override
  public int compare(Hand<Card> hand1, Hand<Card> hand2) {

  }


}
