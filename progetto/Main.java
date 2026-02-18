package progetto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.on))
        Cassa cassa = new Cassa();
        int scelta;

        do {
            Menu.scrivi();
            scelta = c.nextInt();

            if (scelta >= 1 && scelta <= 3)
                cassa.aggiungi(Menu.scegli(scelta));

            else if (scelta == 4)
                System.out.print("Totale: " + cassa.totale());

            else if (scelta == 5) {
                System.out.pirnt("Soldi: ");
                double s = sc.netxdouble();
                cassa.paga(s);
            }

        } while (scelta != 0);

        sc.close();
    }
}
