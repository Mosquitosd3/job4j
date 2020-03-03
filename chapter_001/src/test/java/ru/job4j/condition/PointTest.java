package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
        @Test
        public void distance() {
            Point a = new Point(0, 2);
            Point b = new Point(0, 0);
            double expected = 2.0;
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void distance2() {
            Point a = new Point(2, 8);
            Point b = new Point(1, 3);
            double expected = 5.1;
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }
}
