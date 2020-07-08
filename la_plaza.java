import java.util.Scanner;

public class la_plaza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ancho de la Plaza: ");
		int ancho = sc.nextInt();
		
		System.out.print("Largo de la plaza: ");
		int largo = sc.nextInt();

		System.out.print("Ancho loseta: ");
		int aloseta = sc.nextInt();
		
		if (ancho >=1 && largo >= 1 && aloseta<109) {
			pesoSandia(ancho, largo, aloseta);
		}else {
			System.out.println("Ingresar números positivos....");
		}
		
		sc.close();

	}
	
	public static void pesoSandia(int ancho, int largo,int aloseta) {

		if(ancho%aloseta == 0 && largo%aloseta == 0) {
			System.out.println("Losetas requeridas: "+((ancho/aloseta)*(largo/aloseta)));
		
		}else if(ancho%aloseta == 0 && largo%aloseta != 0) {
			System.out.println("Losetas requeridas: "+((ancho/aloseta)*((largo/aloseta)+1)));
		
		}else if (ancho%aloseta != 0 && largo%aloseta ==0 ) {
			System.out.println("Losetas requeridas: "+(((ancho/aloseta)+1)*(largo/aloseta)));
		
		}else {
			System.out.println("Losetas requeridas: "+ (((ancho/aloseta)+1)*((largo/aloseta)+1)));
		}
		
		
	}

}
