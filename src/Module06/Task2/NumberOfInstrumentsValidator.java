package src.Module06.Task2;

import java.util.Map;
import java.util.Set;

public class NumberOfInstrumentsValidator {
    public void validate(Map inMap) {
        boolean statusValidate = true;
        String statusText = "";
        // проверим не ли в заказе к-во товаров равное 0 или меньше 0
        Set<Map.Entry<String,Integer>> set = inMap.entrySet();
        for (Map.Entry<String,Integer> me: set) {
            if (me.getValue().equals(0)) {
                statusText = "Warning: number of " + me.getKey() + " and/or other is " + me.getValue() + " in Order";
                System.out.println(statusText);
            }
            else if (me.getValue() < 0) {
                statusValidate = false;
                statusText = "Alarm: Number of " + me.getKey() + " and/or other is " + me.getValue() + " (less then 0)";
                break;
            }
        }
        if (!statusValidate) {
            throw new IllegalArgumentException(statusText);
        }
    }
}



