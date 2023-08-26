package domain;

import java.util.Objects;

public class Movie {
    String name;
    int qtdFavorites;

    public Movie(String name) {
        this.name = name;
    }

    public void addFavorite() {
        qtdFavorites++;
    }

    public int getQtdFavorites() {
        return qtdFavorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        System.out.println("equals");
        return Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {

        System.out.println("hashCode");
        //return Objects.hash(name);
        return 1;
    }
}