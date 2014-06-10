package com.xabe.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.xabe.modelo.Coche;

/**
 * Clase que crea el manejador que nos crea el proxy sobre el objecto coche
 * @author Chabir Atrahouch
 *
 */
public class Manejador implements InvocationHandler {

	private Coche coche;

	public Manejador(Coche coche) {
		this.coche = coche;
	}

	public static Coche envolver(Coche objetivo) {
		Manejador manejador = new Manejador(objetivo);
		return (Coche) Proxy.newProxyInstance(objetivo.getClass()
				.getClassLoader(), new Class[] { Coche.class }, manejador);
	}

	public Object invoke(Object proxy, Method method, Object[] params)throws Throwable {
		
		System.out.println("Alguien ha llamdo a la clase coche");
		System.out.println();
		System.out.println("El metodo llamado es : "+method.getName());
		System.out.println();
		System.out.println("Los parametos son : ");
		int i = 1;
		if(params != null)
		{
			for(Object object : params){
				System.out.println(i+"º Los parametos son : "+object.toString());
				i++;
			}
		}
		return method.invoke(coche, params);
	}

}
