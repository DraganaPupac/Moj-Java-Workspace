import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kreiranje skener objekta, system.in predstavlja konzolu
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Unesite ime: ");
		// System.out.println("Unesite integer: ");
		
		// Izvrsavanje skenera i arhiviranje rezultata
		String line = input.nextLine();
		
		// int value = input.nextInt();
		// int value = input.nextDouble();
			

	
		System.out.println("Unesite prezime: ");
		String line1 = input.nextLine();
			
	
			
		// Ispis arhiviranog rezultata
		System.out.println("Vi ste: " + line  + " " + line1);
		
	// Svaki skener i citac treba zatvoriti nakon upotrebe (dobra praksa)
				input.close();
		/*
		 * Zadatak:
		 * 1 - Napisati program koji omogucava korisniku da unese svoje Ime, Prezime, Godinu rodjenja i pol.
		 *   - Nakon sto korisnik unese trazene podatke ispisati jednu recenicu kojom se ponavlja korisnicki unos.
		 */
	}

}