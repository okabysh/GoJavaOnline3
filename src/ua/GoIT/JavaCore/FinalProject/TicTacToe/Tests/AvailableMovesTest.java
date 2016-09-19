package Tests;

import console.AvailableMoves;
import console.GameField;
import org.junit.Test;

import static console.Constants.*;
import static org.junit.Assert.*;

/**
 * @author EarthSoft
 * @version 1.1
 */

public class AvailableMovesTest {
    private AvailableMoves availableMoves = new AvailableMoves();

    @Test(timeout = 100)
    public void test11IsAvailableMove() throws Exception {
        /*test 1.1: тест блока опредяющий возможность следующего хода, сделанный компьютером.
        Значение поля для компьютера - "O". Заполним все поля значением "O" (GameField.squares[]).
        Метод isAvailableMove должен вернуть boolean false*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = COMPUTER_SIGN_O;
        }
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            boolean testValue = availableMoves.isAvailableMove(String.valueOf(i));
            assertEquals(false, testValue);
        }
        System.out.println("Tests 1.1 comleted.");
    }

    @Test(timeout = 100)
    public void test12IsAvailableMove() throws Exception {
       /*test 1.2: тест блока опредяющий возможность следующего хода, сделанный игроком.
        Значение поля для игрока - "X". Заполним все поля значением "X" (GameField.squares[]).
        Метод isAvailableMove должен вернуть boolean false*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = HUMAN_SIGN_X;
        }
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            boolean testValue = availableMoves.isAvailableMove(String.valueOf(i));
            assertEquals(false, testValue);
        }
        System.out.println("Tests 1.2 comleted.");
    }

    @Test(timeout = 100)
    public void test13IsAvailableMove() throws Exception {
        /*test 1.3: тест блока опредяющий возможность следующего хода, сделанный компьютером или игроком.
        Заполним все поля значением "1", "2", "3", "4", "5", "6", "7", "8" и "9"  (GameField.squares[]).
        Метод isAvailableMove должен вернуть boolean true*/
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            GameField.squares[i] = String.valueOf(i);
        }
        for (int i = 0; i < SIZE_OF_GAME_FIELD; i++) {
            boolean testValue = availableMoves.isAvailableMove(String.valueOf(i));
            assertEquals(true, testValue);
        }
        System.out.println("Tests 1.3 comleted.");
    }

    @Test(timeout = 100)
    public void test14IsAvailableMove() throws Exception {
        /*test 1.4: тест возникновения исключительной ситуации ArrayIndexOutOfBoundsException,
        когда следующий ход выбран не из нашего массива,
        т.е. индекс хода выше чем 8, т.е. 9, 10, 11, 100 и т.д.
        Метод isAvailableMove возвращает boolean false, т.к.
        исключительная ситуация обрабатывается при помощи конструкции try - catch.*/
        final int i = 9;
        boolean testValue = availableMoves.isAvailableMove(String.valueOf(i));
        assertEquals(false, testValue);
        System.out.println("Tests 1.4 comleted.");
    }

    @Test(timeout = 100)
    public void test15IsAvailableMove() throws Exception {
        /*test 1.4: тест возникновения исключительной ситуации NumberFormatException,
        когда следующий ход выбран любой символ, отличающийся от цифры.
        Метод isAvailableMove возвращает boolean false, т.к.
        исключительная ситуация обрабатывается при помощи конструкции try - catch.*/
        final String i = "O";
        boolean testValue = availableMoves.isAvailableMove(i);
        assertEquals(false, testValue);
        System.out.println("Tests 1.5 comleted.");
    }
}