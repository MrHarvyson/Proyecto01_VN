/**
 * 
 */
package com.viewnext.proyecto01.clases;

import com.viewnext.proyecto01.interfaces.Truco;

/**
 * @author Admin
 *
 */
public class Delfin extends Mamifero implements Truco {

	private static int contadorTruco;

	/**
	 * @param nombre
	 */
	public Delfin(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarTruco() {

		this.contadorTruco++;
		System.out.println(nombre + " hace un salto impresionante.");

	}
	

	/**
	 * @return the contadorTruco
	 */
	public static int getContadorTruco() {
		return contadorTruco;
	}

	

}
