package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(1, 0.001));
    }

    @Test
    public void distance1() {
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(3, 0.001));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 1, 0);
        Point b = new Point(0, 1, 2);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(2, 0.0001));
    }

    @Test
    public void distance3d1() {
        Point a = new Point(1, 1, 0);
        Point b = new Point(1, 3, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(2, 0.0001));
    }
}