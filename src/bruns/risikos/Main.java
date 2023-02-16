package bruns.risikos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DiceRoll prova = new DiceRoll();
		DiceRoll prova2 = new DiceRoll();
		
		try (Scanner s = new Scanner(System.in)) {
			int nTiri = s.nextInt();
				while(nTiri > 3) {
					System.out.println("Non puoi tirare più di 3 dadi. Riprova");
					nTiri = s.nextInt();
				}
			prova.tiro(nTiri, false);
		}
		catch(Exception e) {
			System.out.println("Qualcosa è andato molto male");
		}
		
		prova2.tiro((int) (Math.random() * 3) + 1, true);
		}

}
