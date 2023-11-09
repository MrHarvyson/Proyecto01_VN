/**
 * 
 */
package com.viewnext.proyecto01.clases;

import com.viewnext.proyecto01.interfaces.Truco;

/**
 * @author JoseMoreno
 * hereda de Mamifiero e implementa la interfaz truco ya que es el unico animal que realiza un truco
 *
 */
public class Delfin extends Mamifero implements Truco {

	/*
	 * generamos un contador statico para obtener la cantidad de trucos que realizan todos los delfines
	 */
	private static int contadorTruco;

	public Delfin(String nombre) {
		super(nombre);
	}

	
	/*
	 * metodo que genera el truco y que va contabilizando la cantidad de trucos que hacen
	 */
	public void realizarTruco() {

		this.contadorTruco++;
		System.out.println(nombre + " hace un salto impresionante.");

	}
	

	/**
	 * para obtener la cantidad de trucos realizados
	 */
	public static int getContadorTruco() {
		return contadorTruco;
	}

	

}
