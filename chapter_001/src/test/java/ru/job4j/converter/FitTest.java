package ru.job4j.converter;
import org.junit.Test;
import org.junit.Assert;

public class FitTest {
    @Test
    public void manWeigth() {
        double in = 100;
        double expected = 0.0;
        double out = Fit.manWeigth(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeigth() {
        double in = 135;
        double expected = 28.75;
        double out = Fit.womanWeigth(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}
