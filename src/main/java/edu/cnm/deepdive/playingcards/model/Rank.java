package edu.cnm.deepdive.playingcards.model;

public enum Rank {

  ACE("Ace"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("T"),
  JACK("J"),
  QUEEN("Q"),
  KING("K");

  private final String symbol;

  Rank(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }

}
