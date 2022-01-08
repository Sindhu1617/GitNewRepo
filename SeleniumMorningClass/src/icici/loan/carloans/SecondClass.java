package icici.loan.carloans;

public class SecondClass {
	
	//data properties
	int a=10,b=5,result;
	//behaviors
	public void add() {
		result=a+b;
		System.out.println("The addition result is " + result);
	}
	public void sub() {
		result=a+b;
		System.out.println("The subtraction result is " + result);
	}
	
	public static void main(String[] args) {
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
	}
}
