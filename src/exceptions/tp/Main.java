package exceptions.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    private static ArrayList<Country> countries = new ArrayList<>();
    private static Country allemagne = new Country("Allemagne");
    private static Country autriche = new Country("Autriche");
    private static Country france = new Country("France");
    private static Country usa = new Country("USA");
    private static Country madagascar = new Country("Madagascar");

    public static void main(String[] args) {
        // testCollections();
        // testExceptions();
        testDivideByZero();
    }

    private static void testCollections() {
        fillCountries();

        System.out.println("\na)");
        displayNbCountries();

        System.out.println("\nb)");
        //displayCountries();

        System.out.println("\nc)");
        countries.clear();
        //displayCountries();

        System.out.println("\nd)");
        fillCountries();
        madagascar.setName("Madagasikara");
        //displayCountries();

        System.out.println("\ne)");
        ArrayList<String> stringCountries = new ArrayList<>();
        stringCountries.add("FRANCE");
        stringCountries.add("BELGIQUE");
        Collections.sort(stringCountries);
        // displayCountriesFromList(stringCountries);
    }

    private static void displayNbCountries() {
        System.out.println(String.format("La collection créée contient %s pays !", countries.size()));
    }

    private static void displayCountries() throws ListEmptyException {
        displayCountriesFromList(countries);
    }

    private static void displayCountriesFromList(ArrayList arrayList) throws ListEmptyException {
        if (arrayList.size() == 0) {
            throw new ListEmptyException();
        } else {
            displayNbCountries();
            arrayList.forEach(c -> System.out.println(c));
        }
    }

    private static void fillCountries() {
        countries = new ArrayList<>(Arrays.asList(
                allemagne, france, autriche, usa, madagascar
        ));
    }

    private static void testExceptions() {
        //fillCountries();
        countries.clear();
        System.out.println("\ng)");
        try {
            displayCountries();
        } catch (ListEmptyException e) {
            System.out.println(e);
        } finally {
            System.out.println("Affichage terminé.");
        }
    }

    private static void testDivideByZero() {
        try {
            divide(1, 2);
        } catch (DivideByZeroException e) {
            System.out.println(e);
        }
        try {
            divide(1, 0);
        } catch (DivideByZeroException e) {
            System.out.println(e);
        }
    }

    private static void divide(float numerator, float denominator) throws DivideByZeroException {
        System.out.println(String.format("\nDivision de %s par %s :", numerator, denominator));
        if (denominator == 0) {
            throw new DivideByZeroException();
        } else {
            System.out.println("Résultat : " + numerator / denominator);
        }
    }
}
