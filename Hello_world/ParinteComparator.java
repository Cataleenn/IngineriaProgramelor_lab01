import java.util.Comparator;

public class ParinteComparator implements Comparator<Parinte> {
    @Override
    public int compare(Parinte parinte1, Parinte parinte2) {
        // Use the compareTo method of String to compare names
        return parinte1.getNume().compareTo(parinte2.getNume());
    }
}