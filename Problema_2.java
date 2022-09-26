package ProyectoUnidad1;

import java.util.Scanner;

public class Problema_2 {

	public static void main (String args[]) {
		
		Scanner Leer=new Scanner(System.in);
		System.out.println("Ingrese el parametro");
		int n=Leer.nextInt();
		int Res=DigitoMinimo(n);
		System.out.println("Parametro: "+n);
		System.out.println("El digito minimo es: "+Res);
		
	}
	
	public static int DigitoMinimo(int n) {
		
		if(n<10) {
			return n%10;
		}
		else {
			
			int m=DigitoMinimo(n/10);
			if(n%10<m) {
				return n%10;
			}else {
				return m;
			}
			
		}
		
	}
	
}
