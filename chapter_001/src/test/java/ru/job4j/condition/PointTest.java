package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
        @Test
        public void distance(){
            double inX1 = 0;
            double inX2 = 2;
            double inY1 = 0;
            double inY2 = 0;
            double expected = 2.0;
            double out = Point.distance(inX1, inY1, inX2, inY2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void distance2(){
            double inX1 = -2.3;
            double inX2 = 8.5;
            double inY1 = 4;
            double inY2 = 0.7;
            double expected = 11.29;
            double out = Point.distance(inX1, inY1, inX2, inY2);
            Assert.assertEquals(expected, out, 0.01);
        }
}
