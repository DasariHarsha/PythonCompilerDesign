package AST;

public class Test implements ASTNode {
	ASTNode t1;
	

	public Test(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Test(");
		t1.print();
		System.out.println(")");

	}

}
