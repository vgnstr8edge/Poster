package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTestWithSetup {
    private PosterManager manager = new PosterManager();
    private MovieItem first = new MovieItem(1, 1, "first", "action");
    private MovieItem second = new MovieItem(2, 2, "second", "drama");
    private MovieItem third = new MovieItem(3, 3, "third", "sport");
    private MovieItem fourth = new MovieItem(4, 4, "fourth", "comedy");
    private MovieItem fifth = new MovieItem(5, 5, "fifth", "action");
    private MovieItem sixth = new MovieItem(6, 6, "sixth", "thriller");
    private MovieItem seventh = new MovieItem(7, 7, "seventh", "action");
    private MovieItem eighth = new MovieItem(8, 8, "eighth", "drama");
    private MovieItem ninth = new MovieItem(9, 9, "ninth", "sport");
    private MovieItem tenth = new MovieItem(10, 10, "tenth", "comedy");
    private MovieItem eleventh = new MovieItem(11, 11, "eleventh", "action");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

    }


    @Test
    public void shouldNineFilms() {
        MovieItem[] expected = new MovieItem[] {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTenFilms() {
        manager.add(tenth);
        MovieItem[] expected = new MovieItem[] {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldElevenFilms() {
        manager.add(tenth);
        manager.add(eleventh);

        MovieItem[] expected = new MovieItem[] {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldZeroFilms() {
        manager = new PosterManager(0);

        MovieItem[] expected = new MovieItem[] {};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNegativeAmount() {
        manager = new PosterManager(-1);

        MovieItem[] expected = new MovieItem[] {};
        MovieItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

}