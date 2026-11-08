package bankapp;

public class Transaksionet {
	
    private int reference;
    private String lloji;
    private double shuma;

    public Transaksionet(String lloji, double shuma) {
    	this.reference = (int)(899999 * Math.random() +100000);
    	this.lloji = lloji;
    	this.shuma = shuma;
    }
    
    public void shfaq() {
    	String shenja;
    	if(lloji.equals("Depozitim")) {
    		shenja = "+";
    	}else {
    		shenja = "-";
    	}
    	System.out.printf("Ref: %d | %s | %s%.2f EUR", reference, lloji, shenja, shuma);
    }
}