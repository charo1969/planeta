package principal;

import modelo.Planeta;

public class PrinPlaneta {

	public static void main(String[] args) {
		
		Planeta p1 = new Planeta("Saturno",200,5.688E26,8.27E23,120536,1418,"GASEOSO",true);
		Planeta p2 = new Planeta("Marte",2,6.41E23,1.63E11,6742,228,"TERRESTRE",true);
		
		
		/**
		 * Todos los datos de los planetas
		 * 
		 */
		System.out.println("los datos de Saturno son "+p1);
		System.out.println("los datos de Marte son "+p2);
		
		/**
		 * Densidad de los planetas 
		 */
		System.out.println("La densidad de Saturno es "+p1.calculaDensidad());
		System.out.println("La densidad de Marte es "+p2.calculaDensidad());


		/**
		 * Planeta es exterior o no
		 */
		
		System.out.println("Saturno es exterior? "+p1.esPlanetaExterior());
		System.out.println("Marte es exterior? "+p2.esPlanetaExterior());
		

	}

	

}
