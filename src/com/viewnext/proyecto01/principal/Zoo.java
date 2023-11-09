/**
 * 
 */
package com.viewnext.proyecto01.principal;

import java.util.Random;

import com.viewnext.proyecto01.clases.Animal;
import com.viewnext.proyecto01.clases.Ave;
import com.viewnext.proyecto01.clases.Delfin;
import com.viewnext.proyecto01.clases.Mamifero;

/**
 * @author JoseMoreno
 *
 */
public class Zoo {

	/**
	 * Iniciamos nuestra apliacion
	 * 
	 */
	public static void main(String[] args) {

		empezarEspectaculo();
	
	}
	
	
	/**
	 * Creamos un método para iniciar nuestro espectáculo
	 */
	public static void empezarEspectaculo() {
		
		Mamifero leon = new Mamifero("Simba");
		Ave aguila = new Ave("Zazú");
		Delfin delfin1 = new Delfin("Flipper");
		Delfin delfin2 = new Delfin("Winter");
		Delfin delfin3 = new Delfin("Delfy");
		Random random = new Random();
		
		Animal arr[]= {leon,aguila,delfin1,delfin2,delfin3};
		Delfin arrDelfines[] = {delfin1,delfin2,delfin3};
		for (Animal inst : arr) {
			inst.hacerSonido();
		}
		
		System.out.println("Bienvenidos al ZOO VIRTUAL¡¡¡");
		System.out.println("Os presentamos a:");
		
		for (Animal inst : arr) {
			inst.getNombre();;
		}
		
		for(int i = 0; i<5 ;i++) {
			int indiceAleatorio = random.nextInt(arrDelfines.length);
			Delfin valorAleatorio = arrDelfines[indiceAleatorio];
			valorAleatorio.realizarTruco();
	        
		}
		
		System.out.println("¡Demos un fuerte aplauso a nuestros " + Animal.NUMERO_ANIMALES + " increibles animales¡¡¡");
		
		
	}

}
