package codegolfej;

public class Main {

	public static void main(String[] args) {

		int[][] m = { { 3, 2, 0 }, { 1, 4, 5 }, { 6, 7, 8 } };
		int[][] m1_valid = { { 1, 2, 3 }, { 6, 5, 4 }, { 8, 0, 7 } };
		int[][] m_false = { { 1, 8, 2 }, { 0, 3, 4 }, { 7, 6, 5 } };
		int[][] m2_false = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
		
		System.out.println(NahuePuzzle.validPuzzle(m1_valid));
	}

}
