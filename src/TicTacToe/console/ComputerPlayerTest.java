package console;

import org.junit.Test;

import static console.Constants.*;
import static org.junit.Assert.*;

public class ComputerPlayerTest {
    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private WinCombinations winCombinations = new WinCombinations();
    private boolean tempValue;

    @Test
    public void isWinner() throws Exception {
        /*test 1.1: {0,1,2,3,4,5,6,7,8} Empty*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        tempValue = computerPlayer.isWinner(EMPTY_CELL);
        assertEquals(true, tempValue);

        /*test 1.2.1: {0,1,2} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 0; i < 3; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.2.2: {0,1,2} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 0; i < 3; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.3.1: {3,4,5} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 3; i < 6; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.3.2: {3,4,5} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 3; i < 6; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.4.1: {6,7,8} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 6; i < 9; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.4.2: {6,7,8} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 6; i < 9; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.5.1: {0,3,6} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = COMPUTER_SIGN_O;
        GameField.squares[3] = COMPUTER_SIGN_O;
        GameField.squares[6] = COMPUTER_SIGN_O;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.5.2: {0,3,6} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = HUMAN_SIGN_X;
        GameField.squares[3] = HUMAN_SIGN_X;
        GameField.squares[6] = HUMAN_SIGN_X;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.6.1: {1,4,7} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[1] = COMPUTER_SIGN_O;
        GameField.squares[4] = COMPUTER_SIGN_O;
        GameField.squares[7] = COMPUTER_SIGN_O;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.6.2: {1,4,7} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[1] = HUMAN_SIGN_X;
        GameField.squares[4] = HUMAN_SIGN_X;
        GameField.squares[7] = HUMAN_SIGN_X;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.7.1: {2,5,8} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = COMPUTER_SIGN_O;
        GameField.squares[5] = COMPUTER_SIGN_O;
        GameField.squares[8] = COMPUTER_SIGN_O;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.7.2: {2,5,8} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = HUMAN_SIGN_X;
        GameField.squares[5] = HUMAN_SIGN_X;
        GameField.squares[8] = HUMAN_SIGN_X;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.8.1: {0,4,8} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = COMPUTER_SIGN_O;
        GameField.squares[4] = COMPUTER_SIGN_O;
        GameField.squares[8] = COMPUTER_SIGN_O;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.8.2: {0,4,8} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = HUMAN_SIGN_X;
        GameField.squares[4] = HUMAN_SIGN_X;
        GameField.squares[8] = HUMAN_SIGN_X;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.9.1: {2,4,6} COMPUTER_SIGN_O*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = COMPUTER_SIGN_O;
        GameField.squares[4] = COMPUTER_SIGN_O;
        GameField.squares[6] = COMPUTER_SIGN_O;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(AI_PLAYER);
        assertEquals(true, tempValue);

        /*test 1.8.2: {2,4,6} HUMAN_SIGN_X*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = HUMAN_SIGN_X;
        GameField.squares[4] = HUMAN_SIGN_X;
        GameField.squares[6] = HUMAN_SIGN_X;
        computerPlayer.parseGameFieldToIntField();
        tempValue = computerPlayer.isWinner(HUMAN_PLAYER);
        assertEquals(true, tempValue);
    }
}