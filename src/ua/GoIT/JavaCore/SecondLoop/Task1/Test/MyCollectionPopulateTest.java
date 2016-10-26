package ua.GoIT.JavaCore.SecondLoop.Task1.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.IMyCollection;
import ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection.MyCollection;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MyCollectionPopulateTest {
    IMyCollection iMyCollection;
    int expected;
    int index, value;

    public MyCollectionPopulateTest(int index, int expected, int value) {
        iMyCollection = new MyCollection();
        iMyCollection.populateCollection();

        this.index = index;
        this.expected = expected;
        this.value = value;
    }

    @Parameterized.Parameters(name = "index: {0}; value expected: {1}; value actual: {2};")
    public static Iterable<Object[]> data () {
        return Arrays.asList(new Object[][] {
                {0,1,1},
                {1,2,2},
                {2,3,3},
                {3,4,4},
                {4,5,5},
        });
    }

    @Test(timeout = 1000)
    public void testPopulate() {
        int result = iMyCollection.get(index);
        Assert.assertEquals(expected, result);
    }
}
