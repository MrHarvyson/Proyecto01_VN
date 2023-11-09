/**
 * 
 */
package com.viewnext.proyecto01.clases;

/**
 * @author JoseMoreno
 * hereda tambien de Animal
 *
 */
public class Ave extends Animal {

	/*
	 * Definimos como una constante que no cambia la contidad de patas que tiene este animal
	 */
	protected final int NUMERO_PATAS = 2;
	
	
	public Ave(String nombre) {
		super(nombre);
	}
	
	/*
	 * sobreescribimos el metodo hacerSonido de Animal
	 */
	@Override
	public void hacerSonido() {
		System.out.println("¡Pio Pio!");
	}
	
	/**
	 * Obtenemos la cantidad de patas de este animal
	 */
	public int getNUMERO_PATAS() {
		return NUMERO_PATAS;
	}

}
