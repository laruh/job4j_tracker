package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {

    @Test
    public void arrayToList() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        MatrixToList list = new MatrixToList();
        List<Integer> rsl =  list.arrayToList(matrix);
        List<Integer> exp = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(rsl, is(exp));
    }

    @Test
    public void listToList() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        MatrixToList list = new MatrixToList();
        List<Integer> rsl = list.listToList(matrix);
        List<Integer> exp = List.of(1, 2, 3, 4);
        assertThat(rsl, is(exp));
    }
}