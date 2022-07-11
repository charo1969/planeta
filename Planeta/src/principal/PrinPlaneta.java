package principal;

import modelo.Planeta;

public class PrinPlaneta {

	public static void main(String[] args) {
		
		Planeta p1 = new Planeta("Saturno1",2,10000,2000,50000,40000,"enano",true);
		Planeta p2 = new Planeta("Saturno2",4,20,20,50,40,"Gaseoso",false);
		
		
		/**
		 * Todos los datos de los planetas
		 * 
		 */
		System.out.println("los datos de Saturno1 son "+p1);
		System.out.println("los datos de Saturno2 son "+p2);
		
		/**
		 * Densidad de los planetas 
		 */
		System.out.println("La densidad de Saturno1 es "+p1.calculaDensidad());
		System.out.println("La densidad de Saturno2 es "+p2.calculaDensidad());
		
		p1.setMasa(4500);
		p1.setVolumen(456456);
		System.out.println("La densidad de Saturno1 es "+p1.calculaDensidad());
		
		
		/**
		 * Planeta es exterior o no
		 */
		
		System.out.println(p1.esPlanetaExterior());
		System.out.println(p2.esPlanetaExterior());
		

	}

	

}
