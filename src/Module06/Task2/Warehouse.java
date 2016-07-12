package src.Module06.Task2;

import java.util.Map;

public class Warehouse {
    private static int piano;
    private static int guitar;
    private static int trumpet;
    Warehouse() {
    }

    public boolean getInsruments(Map inMap) {
        boolean notAllow = false;
        int toOrderPiano = (int) inMap.get("piano");
        int toOrderGuitar = (int) inMap.get("guitar");
        int toOrderTrumpet = (int) inMap.get("trumpet");
        if (toOrderPiano > this.piano) {
            notAllow = true;
        }
        if (toOrderGuitar > this.guitar) {
            notAllow = true;
        }
        if (toOrderTrumpet > this.trumpet) {
            notAllow = true;
        }
        if (notAllow) {
            return false;
        } else {
            this.piano = this.piano - toOrderPiano;
            this.guitar = this.guitar - toOrderGuitar;
            this.trumpet = this.trumpet - toOrderTrumpet;
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
