package day1Java;

public class CompanyDetails {
	public void companyName() {
		System.out.println("Name of the company");

	}
	public void companyName(int a, int b) {
		System.out.println("Name of the company" +a+b);

	}
	public void companyName(int c) {
		System.out.println("Name of the company"+c);

	}
	public void companyName(float d, float e, float f) {
		System.out.println("Name of the company" +d+e+f);

	}
	/*public void companyId() {
		System.out.println("Company ID");

	}
	public void companyAddress() {
		System.out.println("Cmpany Address");

	}*/
	public static void main(String[] args) {
		CompanyDetails cn = new CompanyDetails();
		cn.companyName();
		cn.companyName(2);
		cn.companyName(2, 3);
		cn.companyName(2.4f, 3.2f, 1.2f);
		
	}

}
