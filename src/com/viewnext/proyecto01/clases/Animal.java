/**
 * 
 */
package com.viewnext.proyecto01.clases;

/**
 * @author JoseMoreno
 * Generamos una clase abstracta general
 *
 */
public abstract class Animal {

	String nombre;
	/*
	 *  Creamos una variable estatica para saber cuanta cantidad de animales isntanciamos
	 */
	public static int NUMERO_ANIMALES;
	
	/**
	 * dentro del constructor sumamos na unidad al instanciar un objeto de clase Animal
	 */
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
		NUMERO_ANIMALES++;
	}

	
	public void  hacerSonido() {
		
	}

	/**
	 * Para recuperar todos los nombres de los animales
	 */
	public void getNombre() {
		System.out.println(nombre);
	}

	
	
}
