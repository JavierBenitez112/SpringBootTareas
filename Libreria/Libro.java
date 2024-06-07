package Libreria;
// Clase Libro
public class Libro {
    // Atributos
    String titulo;
    String autor;
    String ISBN;
    double precio;

    // Constructor sin parámetros
    public Libro() {
        // Inicializa los atributos con valores por defecto
        this.titulo = "Título por defecto";
        this.autor = "Autor por defecto";
        this.ISBN = "000-0000000000";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String ISBN, double precio) {
        // Inicializa los atributos con los valores dados
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Detalles del Libro:");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Precio: " + this.precio);
    }

    // Método para actualizar el precio del libro
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio es: " + this.precio);
    }
}