package bankapp;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		int opsioni = -1;
		LlogariaBankare llogaria = new LlogariaBankare();
		
		while (opsioni != 0 ) {
			System.out.println();
			System.out.println("======= BANK APP =======");
			System.out.println();
			System.out.println("1. Perditeso te dhenat e llogarise");
			System.out.println("2. Depozito para");
			System.out.println("3. Terhiq para");
			System.out.println("4. Shfaq detajet e llogarise");
			System.out.println("5. Shfaq historikun e transaksioneve");
			System.out.println("0. Dil nga aplikacioni");
			System.out.println();
			System.out.println("Zgjidh opsionin: ");
			opsioni = input.nextInt();
			input.nextLine();
		
		
		switch (opsioni) {
		case 0: 
			System.out.println("Mirupafshim");
			break;
		case 1:
			System.out.println("-------------------");
			System.out.println("Emri: ");
			String emri = input.nextLine();
			System.out.println("Mbiemri: ");
			String mbiemri = input.nextLine();
			System.out.println("Numri i llogaris: ");
			String numri = input.nextLine();
			
			llogaria.setEmri(emri);
			llogaria.setMbiemri(mbiemri);
			llogaria.setNumriLlogarise(numri);

			break;
		case 2:
		    System.out.print("Shuma per depozitim: ");
		    double shuma = input.nextDouble();
			llogaria.depozito(shuma);
			break;
		case 3:
		    System.out.print("Shuma per terheqje: ");
		    double amount = input.nextDouble();
			llogaria.terhiq(amount);
			break;
		case 4:
			llogaria.shfaqDetajet();
			break;
		case 5:
			llogaria.shfaqHistorikun();
			break;
		default: 
			System.out.println("Opsioni i pavlefshem!");
		   }
		}
		input.close();
	}

}
