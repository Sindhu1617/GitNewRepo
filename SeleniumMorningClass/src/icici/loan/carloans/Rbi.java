package icici.loan.carloans;

public interface Rbi {
	
	public void interest();
	public void interestrate();

	public static void main(String[] args) {
	Rbi r = new Icici();
	r.interest();
	r.interestrate();
	Rbi r1=new Hdfc();
	r1.interest();
	r1.interestrate();
	}
}

