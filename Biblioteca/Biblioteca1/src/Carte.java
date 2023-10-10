import java.util.ArrayList;

public class Carte {
    String autor;
    String titlu;
    Pagina page;
    ArrayList<Pagina> pages = new ArrayList<Pagina>();

    public Carte(String autor, String titlu) {
        this.autor = autor;
        this.titlu = titlu;

    }

    void insertPages(int i, String continut) {

        pages.add(new Pagina(i, continut));

    }

    public String getAutor() {
        return autor;
    }

    public String getTitlu() {
        return titlu;
    }
    public void afiseaza()
    {
        System.out.println("Autor:"+autor+"     Titlu:"+titlu);

    }
}
