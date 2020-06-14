package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
@Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
       int rsl = Factorial.cal(5);
       int expected = 120;
       assertThat(rsl, is(expected));
    }

    @Test
    public void whenCalculateFactorialZerohenOne() {
    int rsl = Factorial.cal(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}
