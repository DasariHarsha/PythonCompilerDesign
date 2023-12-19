package AST;

public class TestnoCond implements ASTNode {
	ASTNode t1;
	

	public TestnoCond(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TestnoCond(");
		t1.print();
		System.out.println(")");

	}

}
