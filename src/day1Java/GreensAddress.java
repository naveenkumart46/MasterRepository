package day1Java;

public class GreensAddress {
	public void greensOmr(int a, float b) {
		System.out.println("Thoraipakkam and Navalur" +a+b);

	}
	public void greensOmr(float a, int b) {
		System.out.println("Thoraipakkam and Navalur" +a+b);

	}
	public void greensOmr(float a) {
		System.out.println("Thoraipakkam and Navalur"+a);

	}
	
	public static void main(String[] args) {
		GreensAddress ga = new GreensAddress();
		ga.greensOmr(12,12.1f);
	    ga.greensOmr(12.1f,12);
	    ga.greensOmr(12.1f);
		
	}
	
	/*public void greensAdyar() {
		System.out.println("Greens Adyar");

	}
	
	public void greensTambaram() {
		System.out.println("Greens Tambaram");

	}
	
	public void greensVelachery() {
		System.out.println("Greens velachery");

	}
	public void greensAnnaNagar() {
		System.out.println("greens AnnaNagar");

	}*/
	

}
