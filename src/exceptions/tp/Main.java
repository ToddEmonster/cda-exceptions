package exceptions.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Country germany = new Country("Allemagne");
        Country austria = new Country("Autriche");
        Country france = new Country("France");
        Country usa = new Country("USA");
        Country madagascar = new Country("Madagascar");

        ArrayList<Country> countries = new ArrayList<Country>(Arrays.asList(
                germany, austria, france, usa, madagascar
        ));

        System.out.println(String.format("La collection crée contient %s pays !", countries.size()));
    }
}
