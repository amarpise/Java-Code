package code.dessign.amar;

public class Derived extends AbstractClass {

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.err.println("In Derived Class");

	}
	void display() {
		System.out.println("In Derived Display");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass abc=new Derived();
		abc.display();
		//abc.print();
		//abc.display();
	
		

	}

}
