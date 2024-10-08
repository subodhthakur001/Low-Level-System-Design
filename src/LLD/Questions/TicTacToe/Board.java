package LLD.Questions.TicTacToe;

public class Board {
    private int size;
    private PlayingPiece [][] board;

    public Board(int size, PlayingPiece[][] board) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
}
