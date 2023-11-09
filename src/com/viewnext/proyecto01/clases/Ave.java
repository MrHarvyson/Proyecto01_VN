/**
 * 
 */
package com.viewnext.proyecto01.clases;

/**
 * @author Admin
 *
 */
public class Ave extends Animal {

	protected final int NUMERO_PATAS = 2;
	
	/**
	 * @param nombre
	 */
	public Ave(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("¡Pio Pio!");
	}
	
	/**
	 * @return the nUMERO_PATAS
	 */
	public int getNUMERO_PATAS() {
		return NUMERO_PATAS;
	}

}
