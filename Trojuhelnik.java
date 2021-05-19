
/**
 * Reprezentuje útvar trojúhelník
 */
public class Trojuhelnik extends Tvar {

    /**
     * Délka strany A
     */
    private double a;

    /**
     * Délka strany B
     */
    private double b;

    /**
     * Délka strany C
     */
    private double c;


    /**
     * @param a Délka strany A
     * @param b Délka strany B
     * @param c Délka strany C
     * @param barva Barva útvaru
     */
    Trojuhelnik(double a, double b, double c, String barva) {
        super(barva);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obsah() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
