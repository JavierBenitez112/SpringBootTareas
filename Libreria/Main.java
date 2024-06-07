package Libreria;
public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935", 15.99);
        libro2.mostrarDetalles();

        // Llama al método 'actualizarPrecio' para 'libro2'
        libro2.actualizarPrecio(12.99);
        libro2.mostrarDetalles();
    }
}