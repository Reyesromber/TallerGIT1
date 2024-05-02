package javataller;

import java.util.Scanner;

public class Game {
	
public static int Max_Score;
 static int option;

public static void launchAndStart() {
	Ball ball = new Ball ();
	System.out.println("La bola se ha lanzado." + "\n" + "Comienza el juego.");
}

public static int leerValidarMenu() {
	option = 0;
	Scanner sc = new Scanner(System.in);

	do {
		InterfazUsuario.mostrarMenú();
		option = sc.nextInt();
	} while (option <= 1 && option > 4);
	/**
	 * Condicion de salida: si opcion >= 1 && opcion < 4 entrada: opcion <1 ||
	 * opcion > 4
	 */
	return option;

}
public static void main(String[] args) {
	launchAndStart();
	option = leerValidarMenu();
	while (option > 4);
	switch (option) {
	case 1: 
		//Lanzar la bola.
		launchAndStart();
	break;
	case 2: 
		//Ver histórico de puntos.
		System.out.println("s");
	break;
	case 3: 
		//Salir.
		System.out.println("Gracias por jugar.");
		System.out.println("¡Hasta la próxima!.");
	break;
	}
}
}