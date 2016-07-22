package src.Module06.Task2;

import java.util.Map;

import static src.Module06.Task2.Constants.*;

public class Warehouse {
    private int piano;
    private int guitar;
    private int trumpet;

    public boolean getInsruments(Map<String, Integer> inMap) {
        boolean notAllow = false;
        int toOrderPiano = inMap.get(CONST_PIANO);
        int toOrderGuitar = inMap.get(CONST_GUITAR);
        int toOrderTrumpet = inMap.get(CONST_TRUMPET);
        if (toOrderPiano > piano) {
            notAllow = true;
        }
        if (toOrderGuitar > guitar) {
            notAllow = true;
        }
        if (toOrderTrumpet > trumpet) {
            notAllow = true;
        }
        if (notAllow) {
            return false;
        } else {
            piano = piano - toOrderPiano;
            guitar = guitar - toOrderGuitar;
            trumpet = trumpet - toOrderTrumpet;
            return true;
        }
    }

    public boolean setInsruments(Map<String, Integer> inMap) {
        this.piano = inMap.get(CONST_PIANO);
        this.guitar = inMap.get(CONST_GUITAR);
        this.trumpet = inMap.get(CONST_TRUMPET);
        return true;
    }
}
