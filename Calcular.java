/** Clase que almacena los métodos de
 * calcular áreas que usaremos en la
 * clase Areas
 * 
 * @author Juan Carlos Chica Ureña
 * @version 1.0 
 * */
public class Calcular {
	
	/** 
	 * @param baseTri base del triángulo 
	 * @param alturaTri altura del triángulo 
	 * @return El área del triángulo */
	public static double areaTriangulo(int baseTri, int alturaTri) {
		return baseTri * alturaTri / 2;
	}
	
	/**
	 * @param baseRec base del rectángulo 
	 * @param alturaRec altura del rectángulo 
	 * @return El área del rectángulo */
	public static int areaRectangulo(int baseRec, int alturaRec) {
		return baseRec * alturaRec;
	}
	
	/** 
	 * @param baseTraA primera base del trapecio 
	 * @param baseTraB segunda base del trapecio 
	 * @param alturaTra altura del trapecio
	 * @param m mediana del trapecio
	 * @return El área del trapecio */
	public static double areaTrapecio(int baseTraA, int baseTraB, int alturaTra) {
			int m = (baseTraA + baseTraB) / 2;
		return alturaTra * m;
	}
	
}
