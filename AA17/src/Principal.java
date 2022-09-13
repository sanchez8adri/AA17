import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		Usuario usuario = new Usuario("sanchez8adri", "Adrian", "Sanchez");
		int numero=-1;
		
		
		System.out.println("Bienvenido, "+usuario.getNombre()+ " " +usuario.getApellido());
		
		Randomizador randomizador = () -> (int)(Math.random()*1000000+1);
		int numeroRandom = randomizador.generadorNumeros();
		System.out.println(numeroRandom);
		

		for(int i=0; i<5; i++){
			System.out.println("Intenta adivinar el número:");
			numero = sn.nextInt();
			
			if(numero == numeroRandom) {
				System.out.println("Adivinaste, campeon");
				i=5;
			}else
				System.out.println("Fallaste...");
		}
		
		if(numeroRandom != numero) {
			System.out.println("Gastaste todos los intentos, hasta otra!");
		}
 		
	}

}
