import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        List<Parinte> l = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Parinte p = new Parinte();
            System.out.println("Enter name:");
            String userName = myObj.nextLine();
            p.setNume(userName);
            l.add(p);
        }
        Collections.sort(l, new ParinteComparator());
        for (Parinte x : l) {
            x.afiseaza();
        }

    }
}
