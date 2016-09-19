package Tests;

import console.ComputerPlayer;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author EarthSoft
 * @version 1.1
 */
public class RunAllTests {
    private AvailableMovesTest availableMovesTest = new AvailableMovesTest();
    private ComputerPlayerTest computerPlayerTest = new ComputerPlayerTest();
    private WinnerSelectorTest winnerSelectorTest = new WinnerSelectorTest();

    @Test(timeout = 100)
    public void RunAllTests() throws Exception {
        availableMovesTest.test11IsAvailableMove();
        availableMovesTest.test12IsAvailableMove();
        availableMovesTest.test13IsAvailableMove();
        availableMovesTest.test14IsAvailableMove();
        availableMovesTest.test15IsAvailableMove();
        computerPlayerTest.isWinner();
        winnerSelectorTest.testIsWinnerExist();
    }
}
