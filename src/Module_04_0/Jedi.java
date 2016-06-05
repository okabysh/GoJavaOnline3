package src.Module_04_0;

/**
 * Created by Oleg Kabysh on 05.06.2016.
 */
public class Jedi {
    private String userName;
    private int ChildrenNumber;
    private boolean IsOnDarkSide;
    private float f;
    Jedi(String userName, int Children, boolean IsOnDarkSide, float f) {
        this.userName = userName;
        this.ChildrenNumber = Children;
        this.IsOnDarkSide = IsOnDarkSide;
        this.f = f;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getChildrenNumber() {
        return this.ChildrenNumber;
    }

    public boolean IsOnDarkSide() {
        return this.IsOnDarkSide;
    }

    public float getF() {
        return this.f;
    }
}
