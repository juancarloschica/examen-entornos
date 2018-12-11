/** Clase que almacena los métodos de
 * calcular áreas que usaremos en la
 * clase Areas
 * 
 * @author Juan Carlos Chica Ureña
 * @version 1.0 
 * */
public class Calcular {
	
	public static double areaTriangulo(int baseTri, int alturaTri) {
		return baseTri * alturaTri / 2;
	}
	
	public static int areaRectangulo(int baseRec, int alturaRec) {
		return baseRec * alturaRec;
	}
	
	public static double areaTrapecio(int baseTraA, int baseTraB, int alturaTra) {
			int m = (baseTraA + baseTraB) / 2;
		return alturaTra * m;
	}
	
}
