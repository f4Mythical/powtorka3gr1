//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Uczen uczen = new Uczen("Okay","Fredek");
        System.out.println("liczba uczniow" + Uczen.getLiczbaUczniow());
    Uczen uczen2 = new Uczen("po","supert");
        System.out.println("liczba uczniow" + Uczen.getLiczbaUczniow());

        Uczen uczen3 = new Uczen("Ok","meta");
        System.out.println("liczba uczniow" + Uczen.getLiczbaUczniow());
        System.out.println(uczen3);
    }

}
