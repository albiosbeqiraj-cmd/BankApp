package bankapp;

public class LlogariaBankare {
	
	private String emri;
	private String mbiemri;
	private String numriLlogarise;
	private double bilanci;
	private Transaksionet[] historiku;
	private int numriTransaksioneve;
	
	public LlogariaBankare() {
		emri = "";
		mbiemri = "";
		numriLlogarise ="";
		bilanci = 0;
		historiku = new Transaksionet[100];
		numriTransaksioneve = 0;
		
		
	}
	
	public void shfaqDetajet() {
		System.out.println("========= DETAJET =========");
		System.out.println("");
		System.out.println("Pronari: "+ emri + " " + mbiemri);
		System.out.println("Numri i llogarise: " + numriLlogarise);
		System.out.println("Bilanci: " + bilanci);
		System.out.println("Numri i transaksioneve: " + numriTransaksioneve);
	}
	
	public void setEmri(String emri) {
		if(emri.isEmpty()) {
			System.out.println("Emri nuk mund te jete bosh!");
			return;
		}
		this.emri = emri;
	}
	
	public void setMbiemri(String mbiemri) {
		if(mbiemri.isEmpty()) {
			System.out.println("Mbiemri nuk mund te jete bosh!");
			return;
		}
		this.mbiemri = mbiemri;
	}
	
	public void setNumriLlogarise(String numriLlogarise) {
		if(numriLlogarise.isEmpty()) {
			System.out.println("Numri i llogarise nuk mund te jete bosh!");
			return;
		}
		this.numriLlogarise = numriLlogarise;
	}

	public boolean depozito(double shuma) {
		if(shuma<=0) {
			System.out.println("Shuma duhet te jete me e madhe se 0!");	
			return false;
		}
		if(numriTransaksioneve == historiku.length) {
		    System.out.println("Historiku i transaksioneve eshte mbushur!");
		    return false;
		}
		bilanci +=shuma;
		regjistro("Depozitim", shuma);
		return true;
		
	}
	
	
	public boolean terhiq(double shuma) {
		if(shuma <=0) {
			System.out.println("Shuma duhet te jete me e madhe se 0!");
			return false;
		}
		if(shuma > bilanci) {
			System.out.println("Ju nuk keni mjete te mjaftueshme!");
			return false;
		}
		if(numriTransaksioneve == historiku.length) {
		    System.out.println("Historiku i transaksioneve eshte mbushur!");
		    return false;
		}
		bilanci -= shuma;
		regjistro("Terheqje", shuma);
		return true;
	}
	
	private void regjistro(String lloji, double shuma) {
		historiku[numriTransaksioneve] = new Transaksionet(lloji,shuma);
		numriTransaksioneve++;
	}
	public int getNumriTransaksioneve(){
		return numriTransaksioneve;
	}
	public void shfaqHistorikun() {
		System.out.println("===== TRANSACTION HISTORY =====");
		if(numriTransaksioneve == 0) {
		    System.out.println("Nuk ka transaksione!");
		    return;
		}
		for(int i = 0; i < numriTransaksioneve;i++) {
			historiku[i].shfaq();
			System.out.println("");
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.printf("Bilanci aktual: %.2f EUR%n", bilanci);
		System.out.println("Total transaksione: " + numriTransaksioneve);
	}
	

}
