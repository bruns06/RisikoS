package bruns.risikos;

import java.util.Arrays;

public class Dice {
	
	final int facceDado = 6;
	int[] result;
	
	int numberOfThrows;
	int c;
	
	int[] tiro(int nTiri, boolean pc) {
		result = new int[3];
		if(pc) {
			System.out.println("Tiri/o del Computer:");
		}
		else {
			System.out.println("Tiri/o del Player");
		}
		for(c = 0 ; c < nTiri ; c++) {
			
			result[c] = (int) (Math.random() * facceDado + 1);
			System.out.println(result[c]);
		}
		
		Arrays.sort(result);
		
		return result;
	
	}
	
	
	public Dice() {
	}
	
	
}
