package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void  whenSumEvenNumbersFromOneToTenThenThirty(){
        int rsl = Counter.sumByEven(1,10);
        int expeced = 30;
        assertThat(rsl, is(expeced));
    }

    @Test
    public void whenSumEvenNumbersFromTenToFiftyThen630(){
        int rsl = Counter.sumByEven(10,50);
        int expected = 630;
        assertThat(rsl, is(expected));
    }
}
