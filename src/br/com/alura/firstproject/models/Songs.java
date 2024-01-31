package br.com.alura.firstproject.models;

import br.com.alura.firstproject.interfaces.Classifiable;

public class Songs extends Audio implements Classifiable {
    private String Album;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    @Override
    public int getRating() {
        if (getTotalviews() >= 15000 & getLikes() >=8000) {
            return 10;
        } else if (getTotalviews() >= 13000 & getLikes() >=4000){
            return 8;
        } else if (getTotalviews() >= 8000 & getLikes() >=2000) {
            return 5;
        } else if (getTotalviews() >= 4000 & getLikes() >=500) {
            return 3;
        }
        return 0;
    }
}
