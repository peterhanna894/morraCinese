package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class morraCinese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();
		int i;					//numero casuale
		int risposta;				//risposta che verrá data dal giocatore
		int j;					//numero inserito per la scelta del giocatore
		int puntiMacchina=0;
		int puntiGiocatore=0;
		String morraCinese [] = {"Forbici","Carta","Sasso"};
		
		
		System.out.println("Benvenuto in una nuova partita\n");
		do {
			i = rand.nextInt(3);	//0      1       2
			String gioco = morraCinese[i];
			System.out.println(gioco+"\n");

			System.out.println("Inserici il numero riferito alla scelta\n\n" + 
					"Forbici (1)\n" + "Carta(2)\n" + "Sasso (3)");
			
			j = sc.nextInt();
			sc.nextLine();
			j=j-1;
			
			if (j<0 || j>2) {
				System.out.println("insersione errata.. Riprova!\n");
			}else if (j-i==-1 || j-i==2) {
				puntiGiocatore++;
				System.out.println("hai vinto");
			} else if (j-i==1 || j-i==-2) {
				puntiMacchina++;
				System.out.println("Ha vinto il pc");
			} else
				System.out.println("nessuno ha vinto");
			
			
			System.out.println("Il tuo punteggio: " + puntiGiocatore);
			System.out.println("Il punteggio macchina: " + puntiMacchina);
			
			
		} while(puntiGiocatore<5 && puntiMacchina<5);
		
		if (puntiGiocatore==5) {
			System.out.println("Bravissimo hai vinto");
		}else if (puntiMacchina==5) {
			System.out.println("mi dispicae hai perso");

		}
			
		
		
	}

}
