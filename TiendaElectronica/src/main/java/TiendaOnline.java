import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TiendaOnline extends Producto {
    private List<Producto> inventario = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public TiendaOnline(String nombre, String descripcion, double precio, int stock, String categoria) {
        super();
    }

    public TiendaOnline() {
        super();
    }

    public void mostrarProductos() {
        for (Producto producto : inventario) {
            System.out.println(producto);
            System.out.println("----------------------");
        }
    }

    public void buscarProducto(String consulta) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(consulta) || producto.getCategoria().equalsIgnoreCase(consulta)) {
                System.out.println(producto);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void agregarProducto() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Stock: ");
        int stock = Integer.parseInt(scanner.nextLine());
        System.out.print("Categoría: ");
        String categoria = scanner.nextLine();

        Producto nuevoProducto = new Producto();
        inventario.add(nuevoProducto);
        System.out.println("Producto agregado correctamente.");
    }

    public void modificarProducto() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo nombre: ");
                producto.setNombre(scanner.nextLine());
                System.out.print("Nueva descripción: ");
                producto.setDescripcion(scanner.nextLine());
                System.out.print("Nuevo precio: ");
                producto.setPrecio(Double.parseDouble(scanner.nextLine()));
                System.out.print("Nuevo stock: ");
                producto.setStock(Integer.parseInt(scanner.nextLine()));
                System.out.print("Nueva categoría: ");
                producto.setCategoria(scanner.nextLine());

                System.out.println("Producto modificado correctamente.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equalsIgnoreCase(nombre)) {
                inventario.remove(i);
                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public void realizarCompra() {
        System.out.print("Ingrese el nombre del producto a comprar: ");
        String nombre = scanner.nextLine();

        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Cantidad a comprar: ");
                int cantidad = Integer.parseInt(scanner.nextLine());
                producto.vender(cantidad);
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Buscar producto");
            System.out.println("3. Agregar producto");
            System.out.println("4. Modificar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Realizar compra");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    tienda.mostrarProductos();
                    break;
                case 2:
                    System.out.print("Ingrese nombre o categoría a buscar: ");
                    String consulta = scanner.nextLine();
                    tienda.buscarProducto(consulta);
                    break;
                case 3:
                    tienda.agregarProducto();
                    break;
                case 4:
                    tienda.modificarProducto();
                    break;
                case 5:
                    tienda.eliminarProducto();
                    break;
                case 6:
                    tienda.realizarCompra();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}