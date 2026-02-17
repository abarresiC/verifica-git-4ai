package progetto;
public class Menu {

    public static Prodotto scegli(int scelta) {

        switch (scelta) {
            case 1: return new Prodotto("Caffe", 1.20);
            case 2: return new Prodotto("Acqua", 1.00);
            case 3: return new Prodotto("Cornetto", 1.40); // BUG prezzo
            default: return null;
        }
    }

    public static void stampa() {
        System.out.println("\n--- BAR ---");
        System.out.println("1) Caffe 1.20");
        System.out.println("2) Acqua 1.00");
        System.out.println("3) Cornetto 1.50");
        System.out.println("4) Totale");
        System.out.println("5) Paga");
        System.out.println("0) Esci");
    }
}
