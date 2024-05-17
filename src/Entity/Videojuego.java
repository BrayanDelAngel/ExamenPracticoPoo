package Entity;

import Interfaz.Entregable;

public class Videojuego implements Entregable {
	private String titulo;
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero;
	private String compania;

	public Videojuego() {
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]\n";
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}

	@Override
	public void compareTo(Object a) {
		if (a instanceof Videojuego) {
			Videojuego otroVideojuego = (Videojuego) a;
			System.out.println("Comparando horas estimadas...");
			int diferencia = this.horasEstimadas - otroVideojuego.horasEstimadas;
			if (diferencia == 0) {
				System.out.println("Ambos videojuegos tienen la misma cantidad de horas estimadas.");
				System.out.println("Los datos completos de los videojuegos son los siguientes: ");
				System.out.println(this.toString());
				System.out.println(otroVideojuego.toString());
			} else if (diferencia > 0) {
				System.out.println(this.titulo + " tiene más horas estimadas que " + otroVideojuego.titulo);
				System.out.println("Los datos completos del videojuego son los siguientes: ");
				System.out.println(this.toString());
			} else {
				System.out.println(otroVideojuego.titulo + " tiene más horas estimadas que " + this.titulo);
				System.out.println("Los datos completos del videojuego son los siguientes: ");
				System.out.println(otroVideojuego.toString());
			}
		} else {
			System.out.println("El objeto no es una instancia de Videojuego.");
		}
	}

}
