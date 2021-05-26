package ru.netology.manager;


import ru.netology.domain.MovieItem;

public class PosterManager {
    private MovieItem[] movies = new MovieItem[0];
    private int anyAmountOfFilm = 10;


    public void add(MovieItem movie) {
        // создаём новый массив размером на единицу больше
        int length = movies.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieItem[] getAll() {
        int resultLenth;
        if (movies.length > anyAmountOfFilm) {
            resultLenth = anyAmountOfFilm;
        } else {
            resultLenth = movies.length;
        }

        MovieItem[] result = new MovieItem[resultLenth];
        for (int i = 0; i < resultLenth; i++) {
            if (movies.length > anyAmountOfFilm) {
                int index = resultLenth - i - 1 + (movies.length - anyAmountOfFilm);
                result[i] = movies[index];
            } else {
                int index = resultLenth - i - 1;
                result[i] = movies[index];
            }
        }
        return result;
    }


    public PosterManager() {
        }


    public PosterManager( int anyAmountOfFilm){
            if (anyAmountOfFilm <= 0) {
                return;
            }
            this.anyAmountOfFilm = anyAmountOfFilm;
        }
    }


