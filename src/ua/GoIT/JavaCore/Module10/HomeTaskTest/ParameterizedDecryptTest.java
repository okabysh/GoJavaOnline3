package ua.GoIT.JavaCore.Module10.HomeTaskTest;

import ua.GoIT.JavaCore.Module10.HomeTask.Decrypt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedDecryptTest {
    int offset;
    String message;
    String expected;

    public ParameterizedDecryptTest(int offset, String message, String expected) {
        this.offset = offset;
        this.message = message;
        this.expected = expected;
    }

    @Parameters(name = "{index}: Decrypt with offset={0}: {1} -> {2}")
    public static Iterable<Object[]> data () {
        return Arrays.asList(new Object[][] {
                {1,"a","z"},
                {1,"b","a"},
                {1,"c","b"},
                {1,"d","c"},
                {1,"e","d"},
                {1,"f","e"},
                {1,"g","f"},
                {1,"h","g"},
                {1,"i","h"},
                {1,"j","i"},
                {1,"k","j"},
                {1,"l","k"},
                {1,"m","l"},
                {1,"n","m"},
                {1,"o","n"},
                {1,"p","o"},
                {1,"q","p"},
                {1,"r","q"},
                {1,"s","r"},
                {1,"t","s"},
                {1,"u","t"},
                {1,"v","u"},
                {1,"w","v"},
                {1,"x","w"},
                {1,"y","x"},
                {1,"z","y"},
                {1,"A","Z"},
                {1,"B","A"},
                {1,"C","B"},
                {1,"D","C"},
                {1,"E","D"},
                {1,"F","E"},
                {1,"G","F"},
                {1,"H","G"},
                {1,"I","H"},
                {1,"J","I"},
                {1,"K","J"},
                {1,"L","K"},
                {1,"M","L"},
                {1,"N","M"},
                {1,"O","N"},
                {1,"P","O"},
                {1,"Q","P"},
                {1,"R","Q"},
                {1,"S","R"},
                {1,"T","S"},
                {1,"U","T"},
                {1,"V","U"},
                {1,"W","V"},
                {1,"X","W"},
                {1,"Y","X"},
                {1,"Z","Y"},
                {1,"5","5"},
                {7,"5","5"},
                {1,"!","!"},
                {1,"(","("},
                {26,"A","A"},
        });
    }

    @Test(timeout = 1000)
    public void testDecrypt() {
        String result = new Decrypt().decryptMessage(message, offset);
        Assert.assertEquals(expected, result);
    }
}
