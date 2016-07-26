package console;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WinCombinationsTest {
    private int[] winCombinationRow1 = {0, 1, 2};
    private int[] winCombinationRow2 = {3, 4, 5};
    private int[] winCombinationRow3 = {6, 7, 8};

    private int[] winCombinationColumn1 = {0, 3, 6};
    private int[] winCombinationColumn2 = {1, 4, 7};
    private int[] winCombinationColumn3 = {2, 5, 8};

    private int[] winCombinationDiagonal1 = {0, 4, 8};
    private int[] winCombinationDiagonal2 = {2, 4, 6};

    @Test(timeout = 100)
    public void testWinCombinations() throws Exception {
        WinCombinations winCombinations = new WinCombinations();
        for (int i = 0; i < winCombinations.listWinCombination.size(); i++) {
            int[] someWinCombination = winCombinations.listWinCombination.get(i);
            if (i == 0) {
                assertArrayEquals(winCombinationRow1, someWinCombination);
            } else if (i == 1) {
                assertArrayEquals(winCombinationRow2, someWinCombination);
            } else if (i == 2) {
                assertArrayEquals(winCombinationRow3, someWinCombination);
            } else if (i == 3) {
                assertArrayEquals(winCombinationColumn1, someWinCombination);
            } else if (i == 4) {
                assertArrayEquals(winCombinationColumn2, someWinCombination);
            } else if (i == 5) {
                assertArrayEquals(winCombinationColumn3, someWinCombination);
            } else if (i == 6) {
                assertArrayEquals(winCombinationDiagonal1, someWinCombination);
            } else if (i == 7) {
                assertArrayEquals(winCombinationDiagonal2, someWinCombination);
            }
        }
    }
}