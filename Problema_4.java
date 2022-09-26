package ProyectoUnidad1;

public class Problema_4 {

	public static void main (String args[]) {
		
		int n= 20;
		
		int Res=misterio(n);
		
		System.out.println(Res);
		
	}
	
	public static int misterio (int n) {
		
		if(n==1 || n == 0)
			return n;
		else
			System.out.println(n);
		
		return 10*misterio(n/2)+n%2;
		
	}
	
}
