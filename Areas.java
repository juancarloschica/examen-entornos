import java.util.Scanner;

/** Clase que utilizaremos para
 * calcular el área
 * 
 * @author matinal
 * @version 1.0
 */
public class Areas {

	public static void main(String[] args) {
		
		/** Método que llama al menú */
		Menu.opcion();
		
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		
		/** Condición para calcular en área del triángulo */
		if (opcion == 1 && opcion <= 1) {
			System.out.println("Introduzca la base del triángulo:");
			int baseTri = sc.nextInt();
			System.out.println("Introduzca la altura del triángulo:");
			int alturaTri = sc.nextInt();
			System.out.println("El área del triángulo es: " + Calcular.areaTriangulo(baseTri, alturaTri));
		}
		
		/** Condición para calcular el área del rectángulo */
		else if (opcion == 2) {
			System.out.println("Introduzca la base del rectángulo:");
			int baseRec = sc.nextInt();
			System.out.println("Introduzca la altura del rectángulo:");
			int alturaRec = sc.nextInt();
			if (baseRec >= 2 && baseRec <= 10 && alturaRec >= 2 && alturaRec <= 10) {
				System.out.println("El área del rectángulo es: " + Calcular.areaRectangulo(baseRec, alturaRec));
			}
		}
		
		/** Condición para calcular el área del trapecio */
		else if (opcion == 3) {
			System.out.println("Introduzca la primera base:");
			int baseTraA = sc.nextInt();
			System.out.println("Introduzca la segunda base:");
			int baseTraB = sc.nextInt();
			System.out.println("Introduzca la altura:");
			int alturaTra = sc.nextInt();
				if (baseTraA != baseTraB) {
					System.out.println("El área del trapecio introducido es: " + Calcular.areaTrapecio(baseTraA, baseTraB, alturaTra));
				}
		}
		
		else {
			System.out.println("Ha elegido la opción 4. Salir o ha introducido mal los datos");
		}
		
	}
}
