package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSortByUpName() {
        Comparator<Job> cmpUpName = new sortByUpName();
        int rsl = cmpUpName.compare(
                new Job("Impl tsk", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSortByDownName() {
        Comparator<Job> cmpDownName = new JobDescByName();
        int rsl = cmpDownName.compare(
                new Job("Impl tsk", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortByUpPriority() {
        Comparator<Job> cmpUpPriority = new sortBuUpPriority();
        int rsl = cmpUpPriority.compare(
                new Job("Impl tsk", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test public void whenSortByDownPriority() {
        Comparator<Job> cmpDownPriority = new JobDescByPriority();
        int rsl = cmpDownPriority.compare(
                new Job("Impl tsk", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}