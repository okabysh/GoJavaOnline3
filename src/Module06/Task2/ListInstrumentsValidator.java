package src.Module06.Task2;

import java.util.Map;
import java.util.Set;

import static src.Module06.Task2.Constants.*;

public class ListInstrumentsValidator {
    static boolean statusValidate = true;
    static String statusText = "";
    public void validate(Map inMap) throws IllegalArgumentException {
        // проверим не ли других товаров для списания кроме: piano, guitar, trumpet
        Set<Map.Entry<String,Integer>> set = inMap.entrySet();
        for (Map.Entry<String,Integer> me: set) {
            if (me.getKey().equals(CONST_PIANO) || me.getKey().equals(CONST_GUITAR) || me.getKey().equals(CONST_TRUMPET)) {
                statusValidate = true;
            } else {
                statusValidate = false;
                statusText = me.getKey();
                break;
            }
        }
        if (!statusValidate) {
            System.out.println("Exception: the pruduct (" + statusText + ") is not in warehouse! ");
        }
    }
}
