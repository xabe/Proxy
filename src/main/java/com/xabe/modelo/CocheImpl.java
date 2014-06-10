package com.xabe.modelo;

public class CocheImpl implements Coche{
	
	private String marca;
	private String modelo;
	
	public CocheImpl(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

}
