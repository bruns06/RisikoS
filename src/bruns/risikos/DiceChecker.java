package bruns.risikos;

public class DiceChecker {
	int maxDice;
	Tank t = new Tank(3);
	boolean isAllowed;
	
	public DiceChecker(int maxDice) {
		this.maxDice = t.nTank;
	}
	
	boolean maxTanks(int tAttack) {
		if(t.nTank >= tAttack) {
			isAllowed = true;
		}
		else {
			isAllowed = false;
		}
		
		return isAllowed;
	}

}

	
	
	
