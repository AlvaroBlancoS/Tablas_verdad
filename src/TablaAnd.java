
public class TablaAnd {
	
	public static void tabla(){
 //Hemos creado las variables atributos de booleanos con el print		
	boolean x = true;
	boolean y = false;
	boolean a1 = x && x;
	boolean a2 = x && y;
	boolean a3 = y && x;
	boolean a4 = y && y;
	
	System.out.println("Tabla de verdad del AND");
	System.out.println(x + " AND " + x + " = " + a1);//La x y la x es a1?
	System.out.println(x + " AND " + y + " = " + a2);//La x y la y es a2?
	System.out.println(y + " AND " + x + " = " + a3);//La y y la x es a3?
	System.out.println(y + " AND " + y + " = " + a4);//La y y la y es a4?
	}
	
	public static void main(String[] args) {
		// Este es el método main con println de tabla()para que nos permita imprimir		
		tabla();
		System.out.println("");
	}

}
