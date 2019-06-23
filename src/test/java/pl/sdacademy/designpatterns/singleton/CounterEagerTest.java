package pl.sdacademy.designpatterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class CounterEagerTest {

    @Test
    public void getInstance_theSameObject() {
        final CounterEager counterA = CounterEager.getInstance();
        final CounterEager counterB = CounterEager.getInstance();

        Assert.assertSame(counterA,counterB);
    }



}