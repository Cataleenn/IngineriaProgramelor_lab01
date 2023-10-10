import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Carte> books = new ArrayList<Carte>();
        Carte c=new Carte("Eminescu","Poezii");
        c.insertPages(1,"Afară-i toamnă, frunza 'mprăştiată, Iar vântul svârlă 'n geamuri grele picuri");
        c.insertPages(2,"Şi tu citeşti scrisori din roase plicuri\n" + "Şi într'un ceas gândeşti la viaţa toată.");
        c.insertPages(3,"Pierzându-ţi timpul tău cu dulci nimicuri,\n" +
                "N'ai vrea ca nimeni 'n uşa ta să bată;");
        books.add(c);
        books.add(new Carte("Eminescu","Ce te legeni"));
        books.add(new Carte("Ion Creanga","Amintiri din copilarie"));
        books.add(new Carte("Arghezi","Florin de mucegai"));
        books.add(new Carte("Coman","Tristetea"));
        Collections.sort(books, new CarteComp());
        for (Carte x : books) {
            x.afiseaza();
        }




    }
}