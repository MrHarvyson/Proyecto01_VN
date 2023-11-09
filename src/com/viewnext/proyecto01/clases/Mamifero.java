/**
 * 
 */
package com.viewnext.proyecto01.clases;

/**
 * @author JoseMoreno
 * Hereda esta clase de Animal
 *
 */
public class Mamifero extends Animal{
	
	/*
	 * Definimos como una constante que no cambia la contidad de patas que tiene este animal
	 */
	protected final int NUMERO_PATAS = 4;
	

	public Mamifero(String nombre) {
		super(nombre);
	}


	/*
	 * Sobre escribimos el metodo hacerSonido desde la clase Animal
	 */
	@Override
	public void hacerSonido() {
		System.out.println("¡Grrr!");
	}
	

	/**
	 * Obtenemos la cantidad de patas que tiene
	 */
	public int getNUMERO_PATAS() {
		return NUMERO_PATAS;
	}
	
	

}
