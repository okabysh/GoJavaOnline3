package src.Module06.Task2;

import java.util.Map;

public class Warehouse {
    private static int piano;
    private static int guitar;
    private static int trumpet;

    public boolean getInsruments(Map inMap) {
        boolean notAllow = false;
        int toOrderPiano = (int) inMap.get("piano");
        int toOrderGuitar = (int) inMap.get("guitar");
        int toOrderTrumpet = (int) inMap.get("trumpet");
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

    public boolean setInsruments(Map inMap) {
        this.piano = (int) inMap.get("piano");
        this.guitar = (int) inMap.get("guitar");
        this.trumpet = (int) inMap.get("trumpet");
        return true;
    }
}
