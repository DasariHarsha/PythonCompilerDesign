package AST;

public class TestLista implements ASTNode {
	ASTNode t1;
	

	public TestLista(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TestLista(");
		t1.print();
		System.out.println(")");

	}

}
