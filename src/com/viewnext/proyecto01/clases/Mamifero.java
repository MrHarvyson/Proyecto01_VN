/**
 * 
 */
package com.viewnext.proyecto01.clases;

/**
 * @author Admin
 *
 */
public class Mamifero extends Animal{
	
	protected final int NUMERO_PATAS = 4;
	

	/**
	 * @param nombre
	 */
	public Mamifero(String nombre) {
		super(nombre);
	}


	@Override
	public void hacerSonido() {
		System.out.println("¡Grrr!");
	}
	
	


	/**
	 * @return the nUMERO_PATAS
	 */
	public int getNUMERO_PATAS() {
		return NUMERO_PATAS;
	}
	
	

}
