
public class TablaOr {

	static void tabla() {
		/*
		 * Nos dice que la salida sea cierta es fuciente que uno o ambos sean ciertos,
		 * es decir es cierto o no. 
		 */
		boolean x = true;
		boolean y = false;
		boolean a1 = x || x;
		boolean a2 = x || y;
		boolean a3 = y || x;
		boolean a4 = y || y;

		System.out.println("Tabla de verdad del OR");
		System.out.println(x + " OR " + x + " = " + a1);//La x o x es a1?
		System.out.println(x + " OR " + y + " = " + a2);// La x o y es a2?
		System.out.println(y + " OR " + x + " = " + a3);//La y o x es a3?
		System.out.println(y + " OR " + y + " = " + a4);//La y o y es a4?
	}
	public static void main(String[] args) {
		
		tabla();
		System.out.println("");
	}

}
