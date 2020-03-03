package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2the2() {
        int result = Max.max(1, 2);
        assertThat(result, is (2));
    }

    @Test
    public void maxFromThree() {
        int result = Max.max(3,5,2);
        assertThat(result, is(5));
    }

    @Test
    public void maxFromFour() {
        int result = Max.max(4, 6, 7, 1);
    }
}
