package com.aula;

public class PruebaAula {

	public static void main(String[] args) {
		Aula magna = new Aula(20,10);
		Aula laboratorioCuatro = new Aula(8,6);
		
		magna.setNumero(1);
		laboratorioCuatro.setNumero(4);
		
//		System.out.println(magna);
//		System.out.println(laboratorioCuatro);
		
		laboratorioCuatro.ocuparEscritorio(0,4);
		laboratorioCuatro.ocuparEscritorio(0,3);
		laboratorioCuatro.ocuparEscritorio(2,5);
		laboratorioCuatro.ocuparEscritorio(5,5);
		magna.ocuparEscritorio(3,4);
		System.out.println(laboratorioCuatro);
		System.out.println(magna);
	}

}
