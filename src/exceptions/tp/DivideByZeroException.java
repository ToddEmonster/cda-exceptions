package exceptions.tp;

public class DivideByZeroException extends Exception {

    @Override
    public String toString() {
        return "Division par zéro interdite >:[";
    }
}
