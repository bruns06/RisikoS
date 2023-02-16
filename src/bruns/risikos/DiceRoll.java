package bruns.risikos;

public class DiceRoll {
	
	final int facceDado = 6;
	
	
	int numberOfThrows;
	int c;
	
	int[] tiro(int nTiri, boolean pc) {
		int[] result = new int[nTiri];
		if(pc) {
			System.out.println("Tiri/o del Computer:");
		}
		else {
			System.out.println("Tiri/o del Player");
		}
		for(c = 0 ; c < nTiri ; c++) {
			
			result[c] = (int) (Math.random() * facceDado);
			System.out.println(result[c]);
		}
		
		return result;
	
	}
	
	
	public DiceRoll() {
	}
	
	
}
