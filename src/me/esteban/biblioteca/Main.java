package me.esteban.biblioteca;

public class Main {
	public static void main(String[] args) {
		Libro libroSinArgumentos = new Libro(); // Libro por defecto

		Libro libroParametrizado = new Libro("1984", "George Orwell", 1, 0); // Libro con parametros

		System.out.println(libroParametrizado);

		//Hay un ejemplar, devolvera true
		if (libroParametrizado.prestamo()) {
			System.out.println("Libro prestado");
		}

		System.out.println(libroParametrizado);

		//No hay ejemplares, devolvera false
		if (!libroParametrizado.prestamo()) {
			System.out.println("Libro no ha podido ser prestado, no hay ejemplares");
		}

		System.out.println(libroParametrizado);

		// Hay un ejemplar prestado, devolvera true
		if (libroParametrizado.devolucion()) {
			System.out.println("Libro devuelto");
		}

		System.out.println(libroParametrizado);

		if (!libroParametrizado.devolucion()) {
			System.out.println("No se pueden devolver libros, no hay mas ejemplares prestados");
		}

		System.out.println(libroParametrizado);
	}
}