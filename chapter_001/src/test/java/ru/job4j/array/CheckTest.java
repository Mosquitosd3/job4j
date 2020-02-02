package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue(){
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByFalseThenTrue(){
        boolean[] input = new boolean[] {false, false, false};
        boolean resuet = Check.mono(input);
        assertThat(resuet, is(true));
    }

    @Test
    public void whenDataMonoByTrueThenFalse(){
        boolean[] input = new boolean[]{true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}
