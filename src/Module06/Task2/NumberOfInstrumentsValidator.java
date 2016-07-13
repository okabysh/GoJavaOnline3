package src.Module06.Task2;

import java.util.Map;
import java.util.Set;

public class NumberOfInstrumentsValidator {
    static boolean statusValidate = true;
    static String statusText = "";
    public void Validate(Map inMap) throws IllegalArgumentException {
        // проверим не ли в заказе к-во товаров равное 0 или меньше 0
        Set<Map.Entry<String,Integer>> set = inMap.entrySet();
        for (Map.Entry<String,Integer> me: set) {
            if (!me.getValue().equals(0)) {
                statusValidate = true;
            } else {
               statusValidate = false;
               statusText = "Warning: number of " + me.getKey() + " and/or other is " + me.getValue() + " in Order";
               break;
            }
            if (me.getValue() > 0) {
                statusValidate = true;
            } else {
                statusValidate = false;
                statusText = "Exception: Number of " + me.getKey() + " and/or other is " + me.getValue() + " (less then 0)";
                break;
            }
        }
        if (!statusValidate) {
           try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println(statusText);
            }
        }
    }
}



