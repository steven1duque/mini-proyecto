public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() { return numPuertas; }
    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }

    public void abrirMaletero() {
        System.out.println("Maletero del auto abierto.");
    }

    public void activarModoDeportivo() {
        System.out.println("Modo deportivo activado. ¡Cuidado con la velocidad!");
    }
}