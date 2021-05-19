

public class Main {

    public static void main(String[] args) {
        Tvar tvary[] = new Tvar[5];

        for (int i = 0; i < 4; i++) { // Přidání 4 trojúhelníků (větví)
            tvary[i] = new Trojuhelnik(25.0, 15.0, 15.0, "zelená");
        }
        tvary[tvary.length - 1] = new Obdelnik(3.0, 26.0, "hnědá"); // Přidání obdélníku (kmenu)

        // Výpočet obsahu všech tvarů
        double soucet = 0;
        for (int i = 0; i < tvary.length; i++) {
            soucet += tvary[i].obsah();
        }

        System.out.println("Obsah stromu je " + soucet + " cm^2");
    }
}
