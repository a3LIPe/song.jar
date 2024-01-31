import br.com.alura.firstproject.models.Podcasts;
import br.com.alura.firstproject.models.Songs;


public class Main {
    public static void main(String[] args) {
        Songs song1 = new Songs();
        song1.setTitle("Êxodo");
        song1.setChannel("Projeto Sola");
        song1.setAlbum("Homem Litúrgico");
        song1.setDurationInMinutes(5);
        song1.setReleaseDate(2020);
        song1.setCollaborators("Guilherme Andrade & Guilherme Iamarino");
        song1.setLikes(9000);
        song1.setTotalviews(20000);
        song1.displaysTechnicalSheet();

        Songs song2 = new Songs();
        song2.setTitle("Eterno Lar");
        song2.setChannel("Projeto Sola");
        song2.setAlbum("Homem Litúrgico");
        song2.setDurationInMinutes(4);
        song2.setReleaseDate(2019);
        song2.setCollaborators("Guilherme Andrade & Guilherme Iamarino");
        song2.setLikes(6000);
        song2.setTotalviews(11000);
        song2.displaysTechnicalSheet();

        Podcasts podcast1 = new Podcasts();
        podcast1.setTitle("Primocast #1 - Mais esperto que o Diabo, de Napoleon Hill");
        podcast1.setEpisode(1);
        podcast1.setChannel("Primocast");
        podcast1.setReleaseDate(2019);
        podcast1.setActive(true);
        podcast1.setCoHost("Camilla Ferreira e Lucas Zafra");
        podcast1.setDurationInMinutes(51);
        podcast1.setAuthor("Thiago Nigro");
        podcast1.setLikes(18000);
        podcast1.setTotalviews(18000);
        podcast1.displaysTechnicalSheet();


        Podcasts podcast2 = new Podcasts();
        podcast2.setTitle("001 - Dihh Lopes");
        podcast2.setEpisode(1);
        podcast2.setChannel("Rogério Vilela");
        podcast2.setReleaseDate(2020);
        podcast2.setActive(true);
        podcast1.setCoHost(null);
        podcast2.setDurationInMinutes(130);
        podcast2.setAuthor("Rogério Vilela");
        podcast2.setCollaborators("Rogério Vilela");
        podcast2.setLikes(5000);
        podcast2.setTotalviews(14000);
        podcast2.displaysTechnicalSheet();
        }
    }

