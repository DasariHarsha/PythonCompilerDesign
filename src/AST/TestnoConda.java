package AST;

public class TestnoConda implements ASTNode {
	ASTNode t1;
	

	public TestnoConda(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TestnoConda(");
		t1.print();
		System.out.println(")");

	}

}
