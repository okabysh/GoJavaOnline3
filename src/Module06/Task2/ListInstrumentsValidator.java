package src.Module06.Task2;

import java.util.Map;
import java.util.Set;

public class ListInstrumentsValidator {
    static boolean statusValidate = true;
    static String statusText = "";
    public void Validate(Map inMap) throws IllegalArgumentException {
        // проверим не ли других товаров для списания кроме: piano, guitar, trumpet
        Set<Map.Entry<String,Integer>> set = inMap.entrySet();
        for (Map.Entry<String,Integer> me: set) {
            if (me.getKey().equals("piano") || me.getKey().equals("guitar") || me.getKey().equals("trumpet")) {
                statusValidate = true;
            } else {
                statusValidate = false;
                statusText = me.getKey();
                break;
            }
        }
        if (!statusValidate) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: the pruduct (" + statusText + ") is not in warehouse! ");
            }
        }
    }
}
