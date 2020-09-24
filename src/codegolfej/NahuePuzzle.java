package codegolfej;

public class NahuePuzzle {
//	public static boolean validPuzzle(int[][] m) {
//		int s = 0, l = m.length, i=0, j=0, z=0;
//		int[] v = new int[l*l];
//		
//		for (; i < l; i++)
//			for (; j < l;) {
//				if (m[i][j] == 0) 
//					z=i+1;
//				v[s++] = m[i][j++];
//			}
//		
//		for (s=i=0; i < l*l-1; i++) 
//			for (j = i+1; j < l*l; j++)
//				if (v[i] > v[j] && v[j]*v[i]>0)
//					s++;
//
//		System.out.println("L =" + l);
//		System.out.println("FILA= " + z);
//		System.out.println("NI =" + s);
//
//		return l%2==0?z%2==0?s%2==0:s%2!=0:s%2==0;
//	}
	public static boolean validPuzzle(int m[][]){
        int a = 0, d, j, i = 0, x, z = 0, l = m.length;
        while(a < l * l){
            x= m[a / l][a % l];
            if (x == 0)
                z = a % l;
            d =a+1;
            while(d < l * l){
                j = m[d / l][d % l];
                if (j != 0 && j < x)
                    i++;
                d++;
            }
            a++;
        }
        
        return l % 2 != 0 ? i % 2 == 0 : z % 2 != 0 ? i % 2 == 0 : i % 2 != 0;
    
	}
}
