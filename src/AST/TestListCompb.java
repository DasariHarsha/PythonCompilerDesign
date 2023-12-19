package AST;

public class TestListCompb implements ASTNode {
	ASTNode t1;
	
	
	public TestListCompb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TestListCompb(");
		t1.print();
		System.out.println(")");

	}

}
