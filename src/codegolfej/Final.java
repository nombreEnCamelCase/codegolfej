package codegolfej;

public class Final {
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
