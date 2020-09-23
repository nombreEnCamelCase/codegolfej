package codegolfej;

public class MatyPuzzle {

	public static boolean validPuzzle3(int[][] m) {
		int countInversions = 0, ladoMatriz = m.length, i, j, k = 0,h=0, zeroRow = 0;

		// No termina de funcar bien, falla en 182

		for (i = 0; i < ladoMatriz; i++)
			for (j = 0; j < ladoMatriz; j++) {
				if (m[i][j] == 0)
					zeroRow = i + 1;
				for (h = i; h < ladoMatriz; h++)
					for (k = j; k < ladoMatriz; k++)
						if (m[i][j] > m[h][k] && m[i][j]*m[h][k]>0)
							countInversions++;
			}

		System.out.println("L =" + ladoMatriz);
		System.out.println("FILA= " + zeroRow);
		System.out.println("NI =" + countInversions);

		if (ladoMatriz % 2 == 0) {
			// Si es par
			if (zeroRow % 2 == 0)
				return countInversions % 2 == 0;
			else
				return countInversions % 2 != 0;
		} else if (countInversions % 2 == 0)
			return true;
		else
			return false;
	}

	/*****************************************************/
	public static boolean validPuzzle_2Maty(int[][] m) {
		int countInversions = 0, ladoMatriz = m.length, totalMat = (ladoMatriz * ladoMatriz), i, j, k = 0, zeroRow = 0;
		int[] vector = new int[totalMat];

		for (i = 0; i < ladoMatriz; i++)
			for (j = 0; j < ladoMatriz; j++) {
				if (m[i][j] == 0)
					zeroRow = i + 1;
				vector[k++] = m[i][j];
			}

		for (i = 0; i < totalMat - 1; i++) {
			for (j = i + 1; j < totalMat; j++) {
				if (vector[i] > vector[j] && vector[j] != 0 && vector[i] != 0)
					countInversions++;
			}
		}

		System.out.println("L =" + ladoMatriz);
		System.out.println("FILA= " + zeroRow);
		System.out.println("NI =" + countInversions);

		if (ladoMatriz % 2 == 0) {
			// Si es par
			if (zeroRow % 2 == 0)
				return countInversions % 2 == 0;
			else
				return countInversions % 2 != 0;
		} else if (countInversions % 2 == 0)
			return true;
		else
			return false;
	}

	// Metodo final a entregar sin el public static
	// 256 CARACTERES (Alto numero)
	public static boolean validPuzzle(int[][] m) {
		int s = 0, l =m.length, c = l * l, i = 0, j = 0, k = 0, z = 0;
		int[] v = new int[c];

		for (;i < l; i++)
			for (;j < l; ) {
				if (m[i][j] == 0)
					z = i + 1;
				v[k++] = m[i][j++];
			}

		for (i = 0; i < c - 1; i++)
			for (j = i + 1; j < c; j++)
				if (v[i] > v[j] && v[j]*v[i] > 0)
					s++;
		return l % 2 == 0 ? z % 2 == 0 ? s % 2 == 0 : s % 2 != 0 : s % 2 == 0;
	}

//	public static boolean validPuzzle_1Maty(int[][] m) {
//	int countInversions = 0, size = m.length, c = (size * size), i, j, k = 0, z = 0;
//	for (k = 0; k < size; k++) {
//		for (i = 0; i < size; i++) {
//			if (m[k][i] == 0)
//				z = k + 1; // Aca guardo el nro de fila donde ta el cero. Le puse +1 xq el ultimo ej tiene
//							// la 1er fila como 1 y no cero.
//			for (j = 0; j < i; j++) {
//				if (m[k][j] > m[k][i])
//					countInversions++;
//			}
//		}
//	}
//
//	System.out.println("L =" + size);
//	System.out.println("FILA= " + z);
//	System.out.println("NI =" + countInversions);
//	return true;
//}
}
