package ProyectoUnidad1;

public class Proyecto_6 {

	public static void main (String args []) {
		
		int i=0, menor=Integer.MAX_VALUE;
		int arreglo []= {6,4,5,2,7};
		int Res = MenorArreglo(arreglo,i,menor);
		System.out.println("El numero menor es: "+Res);
		
	}
	
	public static int MenorArreglo(int arreglo[], int i, int menor) {
		
		System.out.println("Posicion "+i+" = "+arreglo[i]);

		if(i==arreglo.length-1) {
			//System.out.println(i);
			return menor;
		}
		if(arreglo[i]<menor) {
			menor=arreglo[i];
			return MenorArreglo(arreglo,i+1,menor);
		}
		
		i=i+1;
		
		return MenorArreglo(arreglo,i,menor);
		
	}
	
	
	
}
