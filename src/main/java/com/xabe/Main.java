package com.xabe;

import com.xabe.modelo.Coche;
import com.xabe.modelo.CocheImpl;
import com.xabe.proxy.Manejador;

/**
 * Clase Principal para realizar la prueba
 * @author Chabir Atrahouch
 *
 */
public class Main {

	public static void main(String[] args) {
		Coche coche = new CocheImpl("bmw", "320");
		System.out.println(coche.getMarca());
		coche = Manejador.envolver(coche);
		System.out.println(coche.getMarca());
	}

}
