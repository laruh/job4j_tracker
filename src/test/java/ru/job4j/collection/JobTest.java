package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(
                new JobDescByPriority()
        );
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortDescByPriorityRev() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        List<Job> expected = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1),
                new Job("Refactoring", 4)

        );
        Collections.sort(jobs, new JobDescByPriorityRev());
        assertEquals(expected, jobs);
    }

    @Test
    public void sortDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        List<Job> expected = Arrays.asList(
                new Job("Refactoring", 4),
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertEquals(expected, jobs);
    }

    @Test
    public void sortDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        List<Job> expected = Arrays.asList(
                new Job("Refactoring", 4),
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        Collections.sort(jobs, new JobDescByName());
        assertEquals(expected, jobs);
    }

    @Test
    public void sortDescByNameRev() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        Collections.sort(jobs, new JobDescByNameRev());
        assertEquals(expected, jobs);
    }

    @Test
    public void sortDescByNameThenDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        List<Job> expected = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1),
                new Job("Refactoring", 4)
        );
        Comparator<Job> comb = new JobDescByPriorityRev()
                .thenComparing(new JobDescByName());
        Collections.sort(jobs, comb);
        assertEquals(expected, jobs);
    }

    @Test
    public void sortDescByNameThenDescByPriorityRev() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0),
                new Job("Refactoring", 4)
        );
        List<Job> expected = Arrays.asList(
                new Job("Refactoring", 4),
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        Comparator<Job> comb = new JobDescByName()
                .thenComparing(new JobDescByPriorityRev());
        Collections.sort(jobs, comb);
        assertEquals(expected, jobs);
    }
}