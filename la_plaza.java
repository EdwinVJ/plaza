import java.util.Scanner;

public class la_plaza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Ancho de la Plaza: ");
		long ancho = sc.nextInt();
		
		//System.out.print("Largo de la plaza: ");
		long largo = sc.nextInt();

		//System.out.print("Ancho loseta: ");
		long aloseta = sc.nextInt();
		
		//if (ancho >=1 && largo >= 1 && aloseta<109) {
			pesoSandia(ancho, largo, aloseta);
		//}else {
			//System.out.println("Ingresar números positivos....");
		//}
		
		sc.close();

	}
	
	public static void pesoSandia(long ancho, long largo,long aloseta) {

		if(ancho%aloseta == 0 && largo%aloseta == 0) {
			long cc=(ancho/aloseta)*(largo/aloseta);
			System.out.println(+cc);
		
		}else if(ancho%aloseta == 0 && largo%aloseta != 0) {
			System.out.println(((ancho/aloseta)*((largo/aloseta)+1)));
		
		}else if (ancho%aloseta != 0 && largo%aloseta ==0 ) {
			System.out.println((((ancho/aloseta)+1)*(largo/aloseta)));
		
		}else {
			System.out.println((((ancho/aloseta)+1)*((largo/aloseta)+1)));
		}
		
		
	}

}
