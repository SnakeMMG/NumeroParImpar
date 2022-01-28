import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Boolean par = null;

		System.out.println("ingrece un numero");
		Scanner sc = new Scanner(System.in);
		String numero = sc.nextLine();

		int residuo = Integer.parseInt(numero) % 2;

		par = residuo == 0 ? true : false;
		if (par) {
			System.out.println("el numero es par");

		} else {
			System.out.println("el numero es inpar");
		}

	}

}
