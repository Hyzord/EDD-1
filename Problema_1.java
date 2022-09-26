package ProyectoUnidad1;

import java.util.Scanner;

public class Problema_1 {

	public static void main (String args[]) {
		
		Scanner Leer=new Scanner(System.in);
		
		System.out.println("Dame los valores de los dos parametros.");
		
		int p1=Leer.nextInt(), p2=Leer.nextInt();
		
		int Res=MaximoComunDivisor(p1,p2);
		System.out.println("El maximo comun divisor es: "+Res);
		
	}
	
	public static int MaximoComunDivisor(int p1, int p2) {
		
		if (p1==0 || p2==0) {
			return 0;
		}
		
		if(p1==p2) {
			return p1;
		}
		
		if (p1<p2) {
			
			return MaximoComunDivisor(p1,p2-p1);
			
		}
		
		else {
			
			return MaximoComunDivisor(p1-p2,p2);
			
		}
		
		
	}
	
}
