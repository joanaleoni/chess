package main;

import chess.ChessMatch;

/**
 *
 * @author joana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}