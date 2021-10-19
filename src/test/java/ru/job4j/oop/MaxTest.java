package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void testMax() {
        Max max = new Max();
        int rsl = max.max(1, 2);
        assertThat(rsl, is(2));
    }

    @Test
    public void testMax1() {
        Max max = new Max();
        int rsl = max.max(3, 8, 0);
        assertThat(rsl, is(8));
    }

    @Test
    public void testMax2() {
        Max max = new Max();
        int rsl = max.max(18, 8, 4, 3);
        assertThat(rsl, is(18));
    }
}