import java.util.Scanner;

public class existencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int existencias=3200;
		int entregas;
		while(existencias>100) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Selecciona el nº de existencias a pedir:");
			entregas=sc.nextInt();
			existencias=existencias-entregas;
			System.out.println("quedan: "+existencias);
		}
		System.out.println("No existen existencias disponibles");
	}

}