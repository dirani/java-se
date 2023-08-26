package org.example;

import service.MovieService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var movieService = new MovieService();
        movieService.favoritar("Thiago", "Matrix");
        movieService.favoritar("Ricardo", "Matrix");
        movieService.favoritar("Ricardo", "Matrix 2");
        }
    }
    // master
