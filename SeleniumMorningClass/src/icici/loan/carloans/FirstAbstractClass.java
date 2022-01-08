package icici.loan.carloans;

public abstract class FirstAbstractClass {
	int x=100;
	public void m1()
	{
		System.out.println("I am Concrete method from Abstract class");
	}
	public abstract void m2();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstAbstractClass	Obj =new ChildAbsClass();
		Obj.m1();
		Obj.m2();
	}

}
