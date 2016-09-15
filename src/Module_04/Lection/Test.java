package Module_04.Lection;

/**
 * Created by Oleg Kabysh on 05.06.2016.
 */
public class Test {
    public static void main(String[] args) {
        Jedi MyName = new Jedi("Oleg",2,true,42.03456f);
        /*String userName = "Oleg";
        int ChildrenNumber = 2;
        boolean IsOnDarkSide = true;
        float f = 42.03456f;
         System.out.println(userName);*/
        System.out.println(MyName.getUserName()+" "+MyName.getChildrenNumber()+" "+MyName.getF()+" "+MyName.IsOnDarkSide());

    }
}
