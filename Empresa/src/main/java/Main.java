import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();
        EmpresaTransporte empresa = new EmpresaTransporte(buses);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Agregar un bus");
            System.out.println("2. Buscar buses por valor");
            System.out.println("3. Eliminar un bus");
            System.out.println("4. Comprar un bus");
            System.out.println("5. Vender un bus");
            System.out.println("6. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar un bus
                    System.out.println("Ingrese la patente:");
                    String patente = scanner.next();
                    System.out.println("Ingrese la marca:");
                    String marca = scanner.next();
                    System.out.println("Ingrese el año:");
                    int año = scanner.nextInt();
                    System.out.println("Ingrese el precio:");
                    double precio = scanner.nextDouble();
                    Bus nuevoBus = new Bus(patente, marca, año, precio);
                    empresa.agregarBus(nuevoBus);
                    break;
                case 2:
                    // Buscar buses por valor
                    System.out.println("Ingrese el valor a buscar:");
                    double valorBusqueda = scanner.nextDouble();
                    List<Bus> busesEncontrados = empresa.buscarBusesPorValor(valorBusqueda);
                    System.out.println("Buses encontrados:");
                    for (Bus bus : busesEncontrados) {
                        System.out.println("Patente: " + bus.getPatente() + ", Marca: " + bus.getMarca() + ", Año: " + bus.getAño());
                    }
                    break;
                case 3:
                    // Eliminar un bus
                    System.out.println("Ingrese la patente del bus a eliminar:");
                    String patenteEliminar = scanner.next();
                    empresa.eliminarBus(patenteEliminar);
                    break;
                case 4:
                    // Comprar un bus
                    System.out.println("Ingrese la patente del bus a comprar:");
                    String patenteCompra = scanner.next();
                    Bus busCompra = new Bus(patenteCompra, "Marca", 2023, 150000);
                    empresa.comprarBus(busCompra);
                    break;
                case 5:
                    // Vender un bus
                    System.out.println("Ingrese la patente del bus a vender:");
                    String patenteVenta = scanner.next();
                    empresa.venderBus(patenteVenta);
                    break;
                case 6:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
}