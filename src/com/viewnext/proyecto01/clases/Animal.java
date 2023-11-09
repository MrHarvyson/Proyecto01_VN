/**
 * 
 */
package com.viewnext.proyecto01.clases;

/**
 * @author Admin
 *
 */
public abstract class Animal {

	String nombre;
	public static int NUMERO_ANIMALES;
	
	/**
	 * @param nombre
	 */
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
		NUMERO_ANIMALES++;
	}

	public void  hacerSonido() {
		
	}

	/**
	 * @return the nombre
	 */
	public void getNombre() {
		System.out.println(nombre);
	}

	
	
}
