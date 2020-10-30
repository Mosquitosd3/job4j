package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadOutputStream() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void backOutput() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        List<String> list = List.of("one", "1");
        ValidateInput input = new ValidateInput(new StubInput(list));
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(out);
    }

}
