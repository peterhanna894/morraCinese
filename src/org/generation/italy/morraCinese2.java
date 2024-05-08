package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class morraCinese2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();
		int i;					//numero casuale
		int risposta;				//risposta che verrá data dal giocatore
		int j;					//numero inserito per la scelta del giocatore
		int puntiMacchina=0;
		int puntiGiocatore=0;
		String gioco="";
		
		String morraCinese1F="Forbici";
		String morraCinese2C="Carta";
		String morraCinese3S="Sasso";
		System.out.println("Benvenuto in una nuova partita\n");
		do {
			i = rand.nextInt(3)+1;
			if(i==1) {
				gioco = morraCinese1F;
			}else if(i==2) {
				gioco = morraCinese2C;

			}else if(i==3) {
				gioco = morraCinese3S;

			}
				
			//String gioco = morraCinese[i];
			System.out.println(gioco+"\n");

			System.out.println("Inserici il numero riferito alla scelta\n\n" + 
					"Forbici (1)\n" + "Carta(2)\n" + "Sasso (3)");
			
			j = sc.nextInt();
			sc.nextLine();
			//j=j-1;
			
			if (j<1 || j>3) {
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
			System.out.println("Il punteggio macchina: " + puntiMacchina+"\n");
			
			
		} while(puntiGiocatore<5 && puntiMacchina<5);
		
		if (puntiGiocatore==5) {
			System.out.println("Bravissimo hai vinto");
		}else if (puntiMacchina==5) {
			System.out.println("mi dispicae hai perso");

		}
	}

}
