package ru.job4j.collection;

import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell < cells) {
                array[row][cell] = num;
                cell += 1;
            } else {
                row += 1;
                cell = 0;
                array[row][cell] = num;
                cell = 1;
            }
        }
        return array;
    }
}
