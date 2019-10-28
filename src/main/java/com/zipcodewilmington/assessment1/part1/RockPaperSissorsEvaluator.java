package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winSign = "";
        if (handSign == "rock"){winSign = "paper";}
        else if (handSign == "paper"){winSign = "scissor";}
        else if (handSign == "scissor"){winSign = "rock";}
        else {winSign = "not a valid move";}
        return winSign;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loseSign = "";
        if (handSign == "rock"){loseSign = "scissor";}
        else if (handSign == "paper"){loseSign = "rock";}
        else if (handSign == "scissor"){loseSign = "paper";}
        else {loseSign = "not a valid move";}
        return loseSign;    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        //create if statements - if P1 == getWinningMove(P2){return P1;}
        if(handSignOfPlayer1 == getWinningMove(handSignOfPlayer2)){return handSignOfPlayer1;}
        //repeat for P2 win
        else if (handSignOfPlayer2 == getWinningMove(handSignOfPlayer1)){return handSignOfPlayer2;}
        //also account for ties
        else { return "game was a tie - play again!!!";}
    }
}
