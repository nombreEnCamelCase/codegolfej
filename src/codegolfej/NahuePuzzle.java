package codegolfej;

public class NahuePuzzle {
	public static boolean validPuzzle(int[][] m) {
		int s = 0, l = m.length, c = l * l, i=0, j=0, z=0;
		int[] v = new int[c];
		
		for (; i < l; i++)
			for (; j < l; j++) {
				if (m[i][j] == 0) 
					z=i+1;
				v[s++] = m[i][j];
			}
		
		for (s=i=0; i < c-1; i++) 
			for (j = i+1; j < c; j++)
				if (v[i] > v[j] && v[j]*v[i]>0)
					s++;
//
//		System.out.println("L =" + l);
//		System.out.println("FILA= " + z);
//		System.out.println("NI =" + s);

		return l%2==0?z%2==0?s%2==0:s%2!=0:s%2==0;
	}
}
