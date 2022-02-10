package academy.learnprogramming;

public class Knjiga {
    private String ime;
    private String autor;

    public Knjiga(String ime, String autor) {
        this.ime = ime;
        this.autor = autor;
    }

    public String getIme() {
        return ime;
    }

    public String getAutor() {
        return autor;
    }

    public static Knjiga createKnjigu(String ime, String autor) {
        return new Knjiga(ime, autor);
    }
}
