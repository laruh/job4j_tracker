package ru.job4j.tracker;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
@Ignore
public class SqlTrackerTest {
    private SqlTracker tracker;

    @Before
    public void init() {
        tracker = new SqlTracker();
        tracker.init();
    }

    @Test
    public void whenAddThenDelete() {
        Item item = new Item("test");
        tracker.add(item);
        assertTrue(tracker.delete(item.getId()));
    }

    @Test
    public void whenFindById() {
        Item item = new Item("test");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
        assertTrue(tracker.delete(item.getId()));
    }

    @Test
    public void replace() {
        Item item = new Item("test");
        tracker.add(item);
        Item newItem = new Item("newItem");
        tracker.replace(item.getId(), newItem);
        assertEquals("newItem", tracker.findById(item.getId()).getName());
        assertTrue(tracker.delete(item.getId()));
    }

    @Test
    public void findAll() {
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        tracker.add(item1);
        tracker.add(item2);
        List<Item> rsl = tracker.findAll();
        for (int i = 0; i < rsl.size(); i++) {
            assertEquals(String.format("item%d", i + 1), rsl.get(i).getName());
            assertTrue(tracker.delete(rsl.get(i).getId()));
        }
    }

    @Test
    public void findByName() {
        Item item = new Item("item");
        Item item1 = new Item("item");
        tracker.add(item);
        tracker.add(item1);
        List<Item> rsl = tracker.findByName("item");
        for (int i = 0; i < rsl.size(); i++) {
            assertEquals("item", rsl.get(i).getName());
            assertTrue(tracker.delete(rsl.get(i).getId()));
        }
    }
}