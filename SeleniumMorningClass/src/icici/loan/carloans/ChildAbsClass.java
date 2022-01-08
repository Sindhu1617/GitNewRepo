package icici.loan.carloans;

public class ChildAbsClass extends FirstAbstractClass
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChildAbsClass M1	= new ChildAbsClass();
	M1.m1();
	M1.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am overridden clild class from ChildAbstarctClass");
	}
	@Override
	public void m1() {
			System.out.println("I am overridden clild class from AbstarctClass");
	}
}
