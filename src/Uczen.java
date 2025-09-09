public class Uczen extends Osoba {
    private static int liczbaUczniow = 0;
    private int numerUcznis = 0;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        numerUcznis=liczbaUczniow;

    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        Uczen.liczbaUczniow = liczbaUczniow;
    }

    public int getNumerUcznis() {
        return numerUcznis;
    }

    public void setNumerUcznis(int numerUcznis) {
        this.numerUcznis = numerUcznis;
    }

    @Override
    public String toString() {
        return "Uczen{ imie" +getImie()+" nazwisko " + getNazwisko() +
                "numerUcznis=" + numerUcznis +
                '}';
    }
}
