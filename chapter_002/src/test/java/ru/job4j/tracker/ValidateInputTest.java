package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        String[] data = {"one", "1"};
        ValidateInput input = new ValidateStubInput(data);
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(out);
    }

    @Test
    public void whenMoreMaxNumber() {
        String[] data = {"3", "1"};
        ValidateInput input = new ValidateStubInput(data);
        input.askInt("Enter", data.length);
        assertThat(mem.toString(), is(String.format("Please select key from menu.%n")));
        System.setOut(out);
    }
}
