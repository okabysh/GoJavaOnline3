package ua.GoIT.JavaCore.SecondLoop.Task1.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.IMyCollection;
import ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.MyCollection;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MyCollectionAddLastTest {
    IMyCollection iMyCollection;
    int expected;
    int index, value;

    public MyCollectionAddLastTest(int index, int expected, int value) {
        iMyCollection = new MyCollection();
        iMyCollection.populateCollection();
        iMyCollection.addFirst(3);
        iMyCollection.addLast(6);

        this.index = index;
        this.expected = expected;
        this.value = value;
    }

    @Parameterized.Parameters(name = "index: {0}; value expected: {1}; value actual: {2};")
    public static Iterable<Object[]> data () {
        return Arrays.asList(new Object[][] {
                {0,9,9},
                {1,10,10},
                {2,11,11},
                {3,12,12},
                {4,13,13},
                {5,14,14},
                {6,6,6},
        });
    }

    @Test(timeout = 1000)
    public void testAddFirst() {
        int result = iMyCollection.get(index);
        Assert.assertEquals(expected, result);
    }
}
