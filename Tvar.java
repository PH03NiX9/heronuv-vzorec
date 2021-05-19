

/**
 * Reprezentuje společného předka pro všechny geometrické útvary
 */
public class Tvar {

    /**
     * Barva útvaru
     */
    protected String barva;

    /**
     * @param barva Barva útvaru
     */
    Tvar(String barva) {
        this.barva = barva;
    }

    /**
     * Vrátí obsah útvaru
     * @return Obsah útvaru
     */
    public double obsah() {
        return 0.0; //Tato metoda by byla v praxi tzv. abstraktní, viz. dále v seriálu na itnetwork.cz
    }

}
