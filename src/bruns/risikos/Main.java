package bruns.risikos;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException{
		
		Tank t = new Tank(3);
		DiceChecker d = new DiceChecker(t.nTank);
		Dice prova = new Dice();
		Dice prova2 = new Dice();
		
		Scanner s = new Scanner(System.in);
			int nTiri = s.nextInt();
				while(nTiri > 3) {
					System.out.println("Non puoi tirare più di 3 dadi. Riprova");
					nTiri = s.nextInt();
				}
				if(d.maxTanks(nTiri) == false) {
					while(d.maxTanks(nTiri) == false) {
						System.out.println("Non hai abbstanza carri armati. Riprova");
						nTiri = s.nextInt();
					}
				} 
			 prova.tiro(nTiri, false);
			 
	
		
		
		prova2.tiro((int) (Math.random() * 3) + 1, true);
		Arrays.sort(prova.result);
		Arrays.sort(prova2.result);
		int pP = 0;
		int aiP = 0;
		
		try{for(int c = 0; c < prova.result.length + 1 || c < prova2.result.length + 1; c++) {
		
			if(prova.result[c] > prova2.result[c]) {
				pP++;
			}
			if(prova.result[c] < prova2.result[c]) {
				aiP++;
			}
			else {
			
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			if(prova.result.length > prova2.result.length) {
				
			}
		}
		System.out.println("________________________________________________________________________________________________\n\n");
		if(pP > aiP) {
			System.out.println("Vince il Player!\nN vittorie: \t" + pP + "\nTiri vinti dal pc: \t" + aiP);
		}
		if (aiP > pP) {
			System.out.println("Vince il Pc!\nN vittorie: \t" + aiP + "\nTiri vinti dal player: \t" + pP);
		}
		if (pP == aiP) {
			System.out.println("Pareggio.");
		}
	}
}
	
		



