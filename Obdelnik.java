
/**
 * Reprezentuje útvar obdélník
 */
public class Obdelnik extends Tvar {

    /**
     * Šířka
     */
    private double sirka;

    /**
     * Výška
     */
    private double vyska;

    /**
     * @param sirka Šířka
     * @param vyska Výška
     * @param barva Barva útvaru
     */
    Obdelnik(double sirka, double vyska, String barva) {
        super(barva);
        this.sirka = sirka;
        this.vyska = vyska;
    }

    @Override
    public double obsah() {
        return sirka * vyska;
    }
}
