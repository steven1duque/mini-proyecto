public class Motor {
    private int caballosFuerza;
    private String tipoCombustible;

    public Motor(int caballosFuerza, String tipoCombustible) {
        this.caballosFuerza = caballosFuerza;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCaballosFuerza() { return caballosFuerza; }
    public void setCaballosFuerza(int cv) { this.caballosFuerza = cv; }

    public void inyectarCombustible() {
        System.out.println("Inyectando " + tipoCombustible + " al sistema.");
    }

    public void medirTemperatura() {
        System.out.println("Temperatura del motor estable a 90 grados.");
    }
}