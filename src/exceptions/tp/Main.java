package exceptions.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    private static ArrayList<Country> countries;

    public static void main(String[] args) {
        Country allemagne = new Country("Allemagne");
        Country autriche = new Country("Autriche");
        Country france = new Country("France");
        Country usa = new Country("USA");
        Country madagascar = new Country("Madagascar");

        countries = new ArrayList<>(Arrays.asList(
                allemagne, france, autriche, usa, madagascar
        ));

        System.out.println("\na)");
        displayNbCountries();

        System.out.println("\nb)");
        displayCountries();

        System.out.println("\nc)");
        countries.clear();
        displayCountries();

        System.out.println("\nd)");
        countries = new ArrayList<>(Arrays.asList(
                allemagne, france, autriche, usa, madagascar
        ));
        madagascar.setName("Madagasikara");
        displayCountries();

        System.out.println("\ne)");
        ArrayList<String> stringCountries = new ArrayList<>();
        stringCountries.add("FRANCE");
        stringCountries.add("BELGIQUE");
        Collections.sort(stringCountries);
        displayCountriesFromList(stringCountries);


    }

    private static void displayNbCountries() {
        System.out.println(String.format("La collection créée contient %s pays !", countries.size()));
    }
    private static void displayCountries() {
        displayCountriesFromList(countries);
    }

    private static void displayCountriesFromList(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("Liste vide");
        } else {
            displayNbCountries();
            arrayList.forEach(c -> System.out.println(c));
        }
    }
}
