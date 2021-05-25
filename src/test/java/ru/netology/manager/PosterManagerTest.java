package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    PosterManager manager = new PosterManager(5);

    @Test
    public void shouldUseFourFilms() {
        MovieItem first = new MovieItem(1, 1, "first", "action");
        MovieItem second = new MovieItem(2, 2, "second", "drama");
        MovieItem third = new MovieItem(3, 3, "third", "sport");
        MovieItem fourth = new MovieItem(4, 4, "fourth", "comedy");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        MovieItem[] expected = new MovieItem[] {fourth, third, second, first};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseFiveFilms() {
        MovieItem first = new MovieItem(1, 1, "first", "action");
        MovieItem second = new MovieItem(2, 2, "second", "drama");
        MovieItem third = new MovieItem(3, 3, "third", "sport");
        MovieItem fourth = new MovieItem(4, 4, "fourth", "comedy");
        MovieItem fifth = new MovieItem(5, 5, "fifth", "action");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        MovieItem[] expected = new MovieItem[] {fifth, fourth, third, second, first};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldUseSixFilms() {

        MovieItem first = new MovieItem(1, 1, "first", "action");
        MovieItem second = new MovieItem(2, 2, "second", "drama");
        MovieItem third = new MovieItem(3, 3, "third", "sport");
        MovieItem fourth = new MovieItem(4, 4, "fourth", "comedy");
        MovieItem fifth = new MovieItem(5, 5, "fifth", "action");
        MovieItem sixth = new MovieItem(6, 6, "sixth", "thriller");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        MovieItem[] expected = new MovieItem[] {sixth, fifth, fourth, third, second};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

}