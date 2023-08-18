import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;

    public Producto(String nombre, String descripcion, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }


    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nPrecio: $" + precio +
                "\nStock: " + stock +
                "\nCategoría: " + categoria;
    }
}
