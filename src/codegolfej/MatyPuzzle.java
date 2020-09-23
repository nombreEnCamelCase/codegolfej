package codegolfej;

public class MatyPuzzle {

//	public static boolean validPuzzle_1Maty(int[][] m) {
//		int countInversions = 0, size = m.length, c = (size * size), i, j, k = 0, z = 0;
//		for (k = 0; k < size; k++) {
//			for (i = 0; i < size; i++) {
//				if (m[k][i] == 0)
//					z = k + 1; // Aca guardo el nro de fila donde ta el cero. Le puse +1 xq el ultimo ej tiene
//								// la 1er fila como 1 y no cero.
//				for (j = 0; j < i; j++) {
//					if (m[k][j] > m[k][i])
//						countInversions++;
//				}
//			}
//		}
//
//		System.out.println("L =" + size);
//		System.out.println("FILA= " + z);
//		System.out.println("NI =" + countInversions);
//		return true;
//	}

	public static boolean validPuzzle_2Maty(int[][] m) {
		int countInversions = 0, size = m.length, c = (size * size), i, j, k = 0, z=0;
		int[] vector = new int[c];
		
		for (i = 0; i < size; i++)
			for (j = 0; j < size; j++) {
				if (m[i][j] == 0) 
					z=i+1;
				vector[k++] = m[i][j];
			}

		for (i = 0; i < c-1; i++) {
			for (j = i+1; j < c; j++) {
				if (vector[i] > vector[j] && vector[j]!=0 &&  vector[i]!=0)
					countInversions++;
			}
		}
		z++;
		
		System.out.println("L =" + size);
		System.out.println("FILA= " + z);
		System.out.println("NI =" + countInversions);
//		
//		if(size%2==0) {
//			// Si es par
//			if(z%2==0)
//				return countInversions%2==0;
//			else
//				return countInversions%2!=0;
//		}
//		else
//			if(countInversions%2==0)
//				return true;
//			else
//				return false;
//		
		return (size%2==0)?(z%2==0)?countInversions%2==0:countInversions%2!=0:countInversions%2==0;
	

	}
	
	public static boolean validPuzzle(int[][] m) {
		int s = 0, l = m.length, c = l * l, i=0, j=0, k = 0, z=0;
		int[] v = new int[c];
		
		for (; i < l; i++)
			for (; j < l; j++) {
				if (m[i][j] == 0) 
					z=i+1;
				v[k++] = m[i][j];
			}

		for (i=0; i < c-1; i++) 
			for (j = i+1; j < c; j++)
				if (v[i] > v[j] && v[j]!=0 && v[i]!=0)
					s++;
//
//		System.out.println("L =" + l);
//		System.out.println("FILA= " + z);
//		System.out.println("NI =" + s);

		return l%2==0?z%2==0?s%2==0:s%2!=0:s%2==0;
	}
}
