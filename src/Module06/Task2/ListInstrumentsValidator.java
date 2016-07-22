package src.Module06.Task2;

import java.util.Map;
import java.util.Set;

import static src.Module06.Task2.Constants.*;

public class ListInstrumentsValidator {
    public void validate(Map inMap) {
        boolean statusValidate = true;
        String statusText = "";
        // проверим не ли других товаров для списания кроме: piano, guitar, trumpet
        Set<Map.Entry<String,Integer>> set = inMap.entrySet();
        for (Map.Entry<String,Integer> me: set) {
            if (me.getKey().equals(CONST_PIANO) || me.getKey().equals(CONST_GUITAR) || me.getKey().equals(CONST_TRUMPET)) {
            } else {
                statusValidate = false;
                statusText = me.getKey();
                break;
            }
        }
        if (!statusValidate) {
            throw new IllegalArgumentException("Exception: the pruduct (" + statusText + ") is not in warehouse! ");
        }
    }
}
