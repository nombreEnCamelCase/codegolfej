package codegolfej;
/**
 *
 * @author melisa
 */
public class CodegolfMelisa {

    public static boolean isValidPuzzle(int m[][]){
        int a = 0, d, j, i =0, x, z = 0, l = m.length, t = l * l;
        while(a <t){
            x= m[a % l][a / l];
            if (x == 0)
                z = (a % l) % 2;
            d =a+1;
            while(d < t){
                j = m[d % l][d / l];
                if (j != 0 && j > x)
                    i++;
                d++;
            }
            a++;
        }
        
        return l % 2 != 0 ? i % 2 == 0 : z != 0 ? i % 2 == 0 : i % 2 != 0;
    
}
