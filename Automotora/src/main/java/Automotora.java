import java.util.ArrayList;
import java.util.Scanner;
public class Automotora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menú:");
            System.out.println("1. Crear auto");
            System.out.println("2. Crear motocicleta");
            System.out.println("3. Ver vehículos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.nextLine();
                    System.out.print("Ingrese el modelo del auto: ");
                    String modeloAuto = scanner.nextLine();
                    System.out.print("Ingrese el numero de puertas: ");
                    String puertasAuto = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    String patenteAuto = scanner.nextLine();
                    Auto auto = new Auto(marcaAuto, modeloAuto , puertasAuto , patenteAuto);
                    vehiculos.add(auto);
                    System.out.println("Auto creado correctamente.");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Ingrese la marca de la motocicleta: ");
                    String marcaMoto = scanner.nextLine();
                    System.out.print("Ingrese el modelo de la motocicleta: ");
                    String modeloMoto = scanner.nextLine();
                    System.out.print("Ingrese la patente: ");
                    String patenteMoto= scanner.nextLine();
                    Motocicleta motocicleta = new Motocicleta(marcaMoto, modeloMoto,patenteMoto);
                    vehiculos.add(motocicleta);
                    System.out.println("Motocicleta creada correctamente.");
                    break;
                case 3:
                    System.out.println("Lista de vehículos:");
                    for (Vehiculo vehiculo : vehiculos) {
                        System.out.println(vehiculo);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}