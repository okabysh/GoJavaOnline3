package console;

import org.junit.Assert;
import org.junit.Test;

import static console.Constants.*;
import static org.junit.Assert.*;

public class ConstantsTest {
    /*test 3: тест правильности установки константам значений по умолчанию
    * class Constants*/
    @Test(timeout = 100)
    public void testConstants() throws Exception {
        assertEquals("Game Tic Tac Toe", TIC_TAC_TOE_GAME);
        assertEquals("X",HUMAN_SIGN_X);
        assertEquals("O",COMPUTER_SIGN_O);
        assertEquals("Your turn!",LABEL_TEXT_MESSAGE_TURN);
        assertEquals("You won!",LABEL_TEXT_MESSAGE_HUMAN_WON);
        assertEquals("You lost!",LABEL_TEXT_MESSAGE_COMPUTER_WON);
        assertEquals("It's a tie!",LABEL_TEXT_MESSAGE_TIE);
        assertEquals("",EMPTY_STRING);
        assertEquals(0,EMPTY_CELL);
        assertEquals(1,AI_PLAYER);
        assertEquals(2,HUMAN_PLAYER);
        assertEquals(-1,INITIAL_INDEX);
        assertEquals(0,INITIAL_DEPTH);
        assertEquals(9,SIZE_OF_GAME_FIELD);
    }
}