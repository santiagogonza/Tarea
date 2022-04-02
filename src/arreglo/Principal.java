/**
 * paradigma de programacion clase 31 de marzo del 2022
 * explicado por el profe
 */

package arreglo;

public class Principal {
	private static int x;
	private static int y;
	private static byte[] bytePunto = { 1, 2, 3, };
	private static short[] shortPunto = { 1, 2, 3 };
	private static int[] intPunto = { 1, 2, 3, };
	private static double[] doublePunto = { 1.5, 2.5, 3.5 };

	private static byte matriz1[][] = { { 1, 2 }, { 2, 2 } };
	private static short matriz2[][] = { { 1, 2 }, { 1, 2 } };
	private static int[][] matriz3 = new int[2][2];

	private static int array[] = new int[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		

		/**
		 * x=5;
		 * y=10;
		array[0]=++x;
		array[1]=y/x;
		array[2]=++y;
		 */
		
	//System.out.println(+y);	
		
		/**
		 * 
		 
		for(int i=0; i<3; i++) {
			System.out.println(bytePunto[i]+"-"+shortPunto[i]+"-"+intPunto[i]+"-"+doublePunto[i]);
			
		}*/
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				
				matriz3[i][j]= matriz1[i][j]+ matriz2[i][j];
			
			
			}
			
				}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(matriz3[i][j]);
			
		}
	
		
	
	}

}
	
}
