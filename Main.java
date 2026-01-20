public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", 2024, 4);
        Moto miMoto = new Moto("Yamaha", "MT-07", 2023, "Deportivo");

        System.out.println("--- PRUEBA DE AUTO ---");
        miAuto.encender();
        miAuto.abrirMaletero();

        System.out.println("\n--- PRUEBA DE MOTO ---");
        miMoto.encender();
        miMoto.realizarRevision(); 
        miMoto.hacerCaballito();
    }
}