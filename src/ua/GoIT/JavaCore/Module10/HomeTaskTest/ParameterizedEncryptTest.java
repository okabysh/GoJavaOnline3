package ua.GoIT.JavaCore.Module10.HomeTaskTest;

import ua.GoIT.JavaCore.Module10.HomeTask.Encrypt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedEncryptTest {
    int offset;
    String message;
    String expected;

    public ParameterizedEncryptTest(int offset, String message, String expected) {
        this.offset = offset;
        this.message = message;
        this.expected = expected;
    }

    @Parameters(name = "{index}: Encrypt with offset={0}: {1} -> {2}")
    public static Iterable<Object[]> data () {
        return Arrays.asList(new Object[][] {
                {1,"a","b"},
                {1,"b","c"},
                {1,"c","d"},
                {1,"d","e"},
                {1,"e","f"},
                {1,"f","g"},
                {1,"g","h"},
                {1,"h","i"},
                {1,"i","j"},
                {1,"j","k"},
                {1,"k","l"},
                {1,"l","m"},
                {1,"m","n"},
                {1,"n","o"},
                {1,"o","p"},
                {1,"p","q"},
                {1,"q","r"},
                {1,"r","s"},
                {1,"s","t"},
                {1,"t","u"},
                {1,"u","v"},
                {1,"v","w"},
                {1,"w","x"},
                {1,"x","y"},
                {1,"y","z"},
                {1,"z","a"},
                {1,"A","B"},
                {1,"B","C"},
                {1,"C","D"},
                {1,"D","E"},
                {1,"E","F"},
                {1,"F","G"},
                {1,"G","H"},
                {1,"H","I"},
                {1,"I","J"},
                {1,"J","K"},
                {1,"K","L"},
                {1,"L","M"},
                {1,"M","N"},
                {1,"N","O"},
                {1,"O","P"},
                {1,"P","Q"},
                {1,"Q","R"},
                {1,"R","S"},
                {1,"S","T"},
                {1,"T","U"},
                {1,"U","V"},
                {1,"V","W"},
                {1,"W","X"},
                {1,"X","Y"},
                {1,"Y","Z"},
                {1,"Z","A"},
                {1,"5","5"},
                {7,"5","5"},
                {1,"!","!"},
                {1,"(","("},
                {26,"A","A"},
        });
    }

    @Test(timeout = 1000)
    public void testEncrypt() {
        String result = new Encrypt().encryptMessage(message, offset);
        Assert.assertEquals(expected, result);
    }
}
