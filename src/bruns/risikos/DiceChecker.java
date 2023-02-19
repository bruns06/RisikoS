package bruns.risikos;

public class DiceChecker {
	int maxDice;
	//real tank controller
	Tank t = new Tank(1);
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

	
	
	
