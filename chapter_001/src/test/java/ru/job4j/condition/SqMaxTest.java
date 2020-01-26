package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SqMaxTest {
    @Test
    public void whenFirstMax(){
        int result = SqMax.max(5,1,3,2);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax(){
        int result = SqMax.max(1,5,3,2);
        assertThat(result, is(5));
    }

    @Test
    public void whenThrideMax(){
        int result = SqMax.max(1,3,5,2);
        assertThat(result, is(5));
    }

    @Test
    public void whenForthMax(){
        int result = SqMax.max(1,2,3,5);
        assertThat(result, is(5));
    }

}
