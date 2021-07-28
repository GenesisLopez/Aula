package com.aula;

public class Aula {

	private char escritorios[][];
	private final int CANTIDAD_DE_FILAS;
	private final int CANTIDAD_DE_COLUMNAS;
	private char OCUPADO = 'x';
	private char LIBRE;
	private int numero;

	public Aula(int cantidadDeFilas, int cantidadDeColumnas) {
		escritorios = new char[cantidadDeFilas][cantidadDeColumnas];
		CANTIDAD_DE_FILAS = cantidadDeFilas;
		CANTIDAD_DE_COLUMNAS = cantidadDeColumnas;
		inicializarLosEscritorios();
	}

	private void inicializarLosEscritorios() {
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
				escritorios[i][j] = LIBRE;
			}
		}
	}

	public boolean ocuparEscritorio(int fila, int columna) {
		boolean sePudoOcupar = false;
		if (escritorios[fila][columna] == LIBRE) {
			escritorios[fila][columna] = OCUPADO;
			sePudoOcupar = true;
		}
		return sePudoOcupar;
	}

	public boolean liberarEspacio(int fila, int columna) {
		boolean sePudoLiberar = false;
		if (escritorios[fila][columna] == OCUPADO) {
			escritorios[fila][columna] = LIBRE;
			sePudoLiberar = true;
			
		}
		return sePudoLiberar;
	}

	public String toString() {
		String elEstadoDelAula = "Aula";
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			elEstadoDelAula += "\n | ";
			for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
				elEstadoDelAula += escritorios[i][j] + " | ";
			}
		}
		return elEstadoDelAula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
