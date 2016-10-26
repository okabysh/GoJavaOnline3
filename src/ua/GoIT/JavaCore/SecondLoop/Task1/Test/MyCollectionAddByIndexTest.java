package ua.GoIT.JavaCore.SecondLoop.Task1.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.IMyCollection;
import ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.MyCollection;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MyCollectionAddByIndexTest {
    IMyCollection iMyCollection;
    int expected;
    int index, value;

    public MyCollectionAddByIndexTest(int index, int expected, int value) {
        iMyCollection = new MyCollection();
        iMyCollection.populateCollection();
        iMyCollection.addFirst(3);
        iMyCollection.addLast(6);
        iMyCollection.addByIndex(5,10);

        this.index = index;
        this.expected = expected;
        this.value = value;
    }

    @Parameterized.Parameters(name = "index: {0}; value expected: {1}; value actual: {2};")
    public static Iterable<Object[]> data () {
        return Arrays.asList(new Object[][] {
                {0,19,19},
                {1,20,20},
                {2,21,21},
                {3,22,22},
                {4,23,23},
                {5,10,10},
                {6,24,24},
                {7,16,16},

        });
    }

    @Test(timeout = 1000)
    public void testAddFirst() {
        int result = iMyCollection.get(index);
        Assert.assertEquals(expected, result);
    }
}
