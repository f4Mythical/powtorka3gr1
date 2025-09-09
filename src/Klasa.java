public class Klasa {
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(Nauczyciel wychowawca) {
        this.wychowawca = wychowawca;
    }
    private void DodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen))
            return;
        uczniowie.add(uczen);

    }

    @Override
    public String toString() {
        String ListaUczniow = " ";
        foreach(Uczen uczen : uczniowie) {
            ListaUczniow+=uczen+"\n";
        }
        return "Klasa{" + ListaUczniow +
                "wychowawca=" + wychowawca +
                '}';
    }
}
