package icici.loan.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici I = new Icici();
		I.interest();
		I.interestrate();
	}
	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("I am from icici overridden RBI");
	}
	@Override
	public void interestrate() {
		// TODO Auto-generated method stub
		System.out.println("I am from ICICI1 overridden RBI");
	}

}
