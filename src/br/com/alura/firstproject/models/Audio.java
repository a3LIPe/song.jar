package br.com.alura.firstproject.models;

public abstract class Audio {
    private String Title;
    private int durationInMinutes;
    private int Totalviews;
    private int likes;

    public void setTotalviews(int totalviews) {
        this.Totalviews = totalviews;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    private int releaseDate;
    private String collaborators;
    private String channel;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTitle() {
        return Title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalviews() {
        return Totalviews;
    }

    public int getLikes() {
        return likes;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getCollaborators() {
        return collaborators;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setReleaseDate(int date) {
        releaseDate = date;
    }

    public void setCollaborators(String collaborators) {
        this.collaborators = collaborators;
    }


    public void displaysTechnicalSheet() {
        System.out.println("Title: " + getTitle());
        System.out.println("Release: " + getReleaseDate());
        System.out.println("Duration: " + getDurationInMinutes() + " minutes");
        System.out.println("From: " + getChannel());
        System.out.println("Likes: " + getLikes());
        System.out.println("views: " + getTotalviews());
        System.out.println("\n");
    }
}
