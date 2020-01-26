package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2the2(){
        int result = Max.max(1,2);
        assertThat(result, is (2));
    }

    @Test
    public void isMaxFirst(){
        int result = Max.max(2,1);
        assertThat(result, is (2));
    }

    @Test
    public void isMaxSecond(){
        int result = Max.max(1,3);
        assertThat(result, is (3));
    }

    @Test
    public void isMaxFirstOrSecond(){
        int result = Max.max(10,10);
        assertThat(result, is(10));
    }
}
