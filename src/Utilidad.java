/**
 * 
 * @author Jesus
 * @version 1.0
 * @since 06/03/2023
 * 
 */
public class Utilidad {
	/**
	 * 
	 * @param a valor Integer 
	 * @return Devuelve el valor "a" mas su factorial
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * 
	 * @param n valor Integer
	 * @return Devuelve el factorial de "n" 
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * 
	 * @param a refactor
	 * @param b
	 * @return
	 */
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	
}
