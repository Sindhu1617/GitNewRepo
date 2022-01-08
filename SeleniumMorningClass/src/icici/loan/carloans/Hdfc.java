package icici.loan.carloans;

public class Hdfc implements Rbi
{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Hdfc H =new Hdfc();
	H.interestrate();
	H.interest();
	}


	@Override
	public void interestrate() {
		// TODO Auto-generated method stub
		System.out.println("I am from hdfc overridden RBI");
		
	}


	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("I am hdfc1 overridden RBI");
	}

}
