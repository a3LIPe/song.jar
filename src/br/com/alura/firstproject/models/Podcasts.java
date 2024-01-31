package br.com.alura.firstproject.models;

import br.com.alura.firstproject.interfaces.Classifiable;

public class Podcasts extends Audio implements Classifiable {
    private String author;
    private String coHost;
    private boolean active;
    private int episode;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoHost() {
        return coHost;
    }

    public void setCoHost(String coHost) {
        this.coHost = coHost;
    }

    @Override
    public int getRating() {
        if (getTotalviews() >= 30000 & getLikes() >=16000) {
            return 10;
        } else if (getTotalviews() >= 15000 & getLikes() >=8000){
            return 8;
        } else if (getTotalviews() >= 8500 & getLikes() >=4000) {
            return 5;
        } else if (getTotalviews() >= 4000 & getLikes() >=2000) {
            return 3;
        }
        return 0;
    }
}
