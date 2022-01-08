package icici.loan.carloans;

public class B extends A
{
	
	public void m2() {
		System.out.println("i m m2 from class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m2();
		b.m1();
	A a=new A();
	a.m1();
	
	}

}
