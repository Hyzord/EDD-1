package ProyectoUnidad1;

public class Problema_5 {

	public static void main (String args[]) {
		
		int p=1111, o=0;
		
		int Res=BinarioADecimal(p,o);
		System.out.println("Parametro: "+p);
		System.out.println("La convercion a decimal es: "+Res);
		
	}
	
	public static int BinarioADecimal(int p, int o) {
		
		int D=0, conversion=0,i = 0;
		i=i+1;
		if(p<10) {
			conversion=(p%2)*(int)Math.pow(2,o);
			
			return D=D+conversion;
		}else {
			BinarioADecimal(p/10,o-1);
			conversion=(p%2)*(int)Math.pow(2,o);
			
			return D=D+conversion;
		}
				
	}
	
}
