public class Moto extends Vehiculo implements Mantenimiento {
    private String tipoManubrio;

    public Moto(String marca, String modelo, int anio, String tipoManubrio) {
        super(marca, modelo, anio);
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoManubrio() { return tipoManubrio; }
    public void setTipoManubrio(String tipoManubrio) { this.tipoManubrio = tipoManubrio; }

    public void hacerCaballito() {
        System.out.println("La moto está haciendo un caballito.");
    }

    public void ajustarCadena() {
        System.out.println("Cadena ajustada correctamente.");
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revisando frenos y neumáticos de la moto...");
    }
}