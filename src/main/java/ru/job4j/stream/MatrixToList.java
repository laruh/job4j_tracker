package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public List<Integer> arrayToList(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

    public List<Integer> listToList(List<List<Integer>> matrix) {
        return matrix.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
