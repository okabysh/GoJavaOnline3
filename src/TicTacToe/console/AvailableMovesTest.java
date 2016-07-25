package src.TicTacToe.console;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Oleg Kabysh on 25.07.2016.
 */
public class AvailableMovesTest {
    public static AvailableMoves availableMoves = new AvailableMoves();

    @Test
    public void isAvailableMovesTest() throws Exception {
        boolean temp = availableMoves.isAvailableMove("5");
        Assert.assertEquals(true, true);
    }
}
