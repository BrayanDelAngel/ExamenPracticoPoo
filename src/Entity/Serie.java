package Entity;

import Interfaz.Entregable;

public class Serie implements Entregable {
	private String titulo;
	private int noTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;

	public Serie() {
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int noTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.noTemporadas = noTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNoTemporadas() {
		return noTemporadas;
	}

	public void setNoTemporadas(int noTemporadas) {
		this.noTemporadas = noTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", noTemporadas=" + noTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]\n";
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
	        if (a instanceof Serie) {
	            Serie otraSerie = (Serie) a;
	            System.out.println("Comparando número de temporadas...");
	            int diferencia = this.noTemporadas - otraSerie.noTemporadas;
	            if (diferencia == 0) {
	                System.out.println("Ambas series tienen el mismo número de temporadas.");
	                System.out.println("Los datos completos de las series son los siguientes: ");
	                System.out.println(this.toString());
	                System.out.println(otraSerie.toString());
	            } else if (diferencia > 0) {
	                System.out.println(this.titulo + " tiene más temporadas que " + otraSerie.titulo);
	                System.out.println("Los datos completos de la serie son los siguientes: ");
	                System.out.println(this.toString());
	            } else {
	                System.out.println(otraSerie.titulo + " tiene más temporadas que " + this.titulo);
	                System.out.println("Los datos completos de la serie son los siguientes: ");
	                System.out.println(otraSerie.toString());
	            }
	        } else {
	            System.out.println("El objeto no es una instancia de Serie.");
	        }
	    }

}
