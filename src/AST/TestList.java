package AST;

public class TestList implements ASTNode {
	ASTNode t1;
	

	public TestList(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub\
		System.out.println("TestList(");
		t1.print();
		System.out.println(")");

	}

}
