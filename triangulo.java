import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		
		float altura;
        float base;
        float area;

        Scanner sc  = new Scanner(System.in);
        System.out.println("altura: ");
        altura=sc.nextInt();
        System.out.println("base: ");
        base=sc.nextInt();
        System.out.println("el area es: "+(area=(base*altura)/2));
    }
}