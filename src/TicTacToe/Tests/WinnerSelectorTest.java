package Tests;

import console.GameField;
import console.WinnerSelector;
import org.junit.Test;

import static console.Constants.SIZE_OF_GAME_FIELD;
import static console.Constants.COMPUTER_SIGN_O;
import static console.Constants.HUMAN_SIGN_X;
import static org.junit.Assert.*;

/**
 * @author EarthSoft
 * @version 1.1
 */
public class WinnerSelectorTest {
    private String[] gameField = GameField.squares;
    private boolean tempValue;
    private WinnerSelector winnerSelector = new WinnerSelector();

    @Test
    public void testIsWinnerExist() throws Exception {
        // test 5.1.1 проверка кобинации {0,1,2} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 0; i < 3; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.1.2 проверка кобинации {0,1,2} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 0; i < 3; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.2.1 проверка кобинации {3,4,5} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 3; i < 6; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.2.2 проверка кобинации {3,4,5} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 3; i < 6; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.3.1 проверка кобинации {6,7,8} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 6; i < 9; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.3.2 проверка кобинации {6,7,8} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 6; i < 9; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.4.1 проверка кобинации {0,3,6} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = COMPUTER_SIGN_O;
        GameField.squares[3] = COMPUTER_SIGN_O;
        GameField.squares[6] = COMPUTER_SIGN_O;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.4.2 проверка кобинации {0,3,6} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = HUMAN_SIGN_X;
        GameField.squares[3] = HUMAN_SIGN_X;
        GameField.squares[6] = HUMAN_SIGN_X;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.5.1 проверка кобинации {1,4,7} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[1] = COMPUTER_SIGN_O;
        GameField.squares[4] = COMPUTER_SIGN_O;
        GameField.squares[7] = COMPUTER_SIGN_O;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.5.2 проверка кобинации {1,4,7} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[1] = HUMAN_SIGN_X;
        GameField.squares[4] = HUMAN_SIGN_X;
        GameField.squares[7] = HUMAN_SIGN_X;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.6.1 проверка кобинации {2,5,8} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = COMPUTER_SIGN_O;
        GameField.squares[5] = COMPUTER_SIGN_O;
        GameField.squares[8] = COMPUTER_SIGN_O;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.6.2 проверка кобинации {2,5,8} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = HUMAN_SIGN_X;
        GameField.squares[5] = HUMAN_SIGN_X;
        GameField.squares[8] = HUMAN_SIGN_X;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.7.1 проверка кобинации {0,4,8} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = COMPUTER_SIGN_O;
        GameField.squares[4] = COMPUTER_SIGN_O;
        GameField.squares[8] = COMPUTER_SIGN_O;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.7.2 проверка кобинации {0,4,8} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[0] = HUMAN_SIGN_X;
        GameField.squares[4] = HUMAN_SIGN_X;
        GameField.squares[8] = HUMAN_SIGN_X;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.8.1 проверка кобинации {2,4,6} как на выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = COMPUTER_SIGN_O;
        GameField.squares[4] = COMPUTER_SIGN_O;
        GameField.squares[6] = COMPUTER_SIGN_O;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.8.2 проверка кобинации {2,4,6} как на выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        GameField.squares[2] = HUMAN_SIGN_X;
        GameField.squares[4] = HUMAN_SIGN_X;
        GameField.squares[6] = HUMAN_SIGN_X;
        tempValue = winnerSelector.isWinnerExist();
        assertEquals(true, tempValue);

        // test 5.9.1 проверка части кобинаций как еще не выграшную, поля заполненные компьютером
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            for (int j = 0; j < SIZE_OF_GAME_FIELD; j++) {
                GameField.squares[j] = String.valueOf(j);
            }
            GameField.squares[i] = COMPUTER_SIGN_O;
            tempValue = winnerSelector.isWinnerExist();
            assertEquals(false, tempValue);
        }

        // test 5.9.2 проверка части кобинаций как еще не выграшную, поля заполненные игроком
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            for (int j = 0; j < SIZE_OF_GAME_FIELD; j++) {
                GameField.squares[j] = String.valueOf(j);
            }
            GameField.squares[i] = HUMAN_SIGN_X;
            tempValue = winnerSelector.isWinnerExist();
            assertEquals(false, tempValue);
        }

    }

}