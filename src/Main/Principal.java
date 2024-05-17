package Main;

import Entity.Serie;
import Entity.Videojuego;
import Interfaz.Entregable;

public class Principal {
	// Método para contar cuántos objetos están entregados en un array de Entregable
	private static int contarEntregados(Entregable[] entregables) {
		int entregados = 0;
		for (Entregable entregable : entregables) {
			if (entregable.isEntregado()) {
				entregados++;
				// Se devuelve una vez contado
				entregable.devolver();
			}
		}
		return entregados;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		Serie serie = null;
		Videojuego videojuego = null;

		Serie serie1 = new Serie("The Big Bang Theory", 12, "Comedia", "Chuck Lorre");
		Serie serie2 = new Serie("Breaking Bad", 5, "Drama Criminal", "Vince Gilligan");
		Serie serie3 = new Serie("Saul Goodman", 6, "Drama", "Vince Gilligan");
		Serie serie4 = new Serie("Suits", 9, "Drama", "Aaron Korsh");
		Serie serie5 = new Serie("Dr. House", 8, "Drama médico", "David Shore");

		series[0] = serie1;
		series[1] = serie2;
		series[2] = serie3;
		series[3] = serie4;
		series[4] = serie5;

		Videojuego videojuego1 = new Videojuego("Super mario bros", 4, "Aventura", "Nintento");
		Videojuego videojuego2 = new Videojuego("Dinocrisis", 5, "Supervivencia", "PlayStation");
		Videojuego videojuego3 = new Videojuego("Residen Evil 2", 3, "Supervivencia", "PlayStation");
		Videojuego videojuego4 = new Videojuego("Halo", 6, "Aventura", "Microsoft");
		Videojuego videojuego5 = new Videojuego("Resident Evil 4", 6, "Supervivencia", "PlayStation");

		videojuegos[0] = videojuego1;
		videojuegos[1] = videojuego2;
		videojuegos[2] = videojuego3;
		videojuegos[3] = videojuego4;
		videojuegos[4] = videojuego5;
		//Entregando series y videojuegos
		series[0].entregar();
		series[2].entregar();

		videojuegos[1].entregar();
		videojuegos[3].entregar();
		videojuegos[4].entregar();

		// Contar cuántos Series y Videojuegos están entregados
		int seriesEntregadas = contarEntregados(series);
		int videojuegosEntregados = contarEntregados(videojuegos);
		System.out.println("*************************************************");
		System.out.println("Series y videjuegos entregados. ");
		System.out.println("Series entregadas: " + seriesEntregadas);
		System.out.println("Videojuegos entregados: " + videojuegosEntregados);
		System.out.println("*************************************************");
		System.out.println("");
		System.out.println("*************************************************");
		System.out.println("Comparando series y videjuegos");
		series[0].compareTo(series[1]);
		videojuegos[4].compareTo(videojuegos[1]);
		System.out.println("*************************************************");

	}

}
