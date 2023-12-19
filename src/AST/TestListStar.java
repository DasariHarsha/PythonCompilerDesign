package AST;

public class TestListStar implements ASTNode {
	ASTNode t1;
	

	public TestListStar(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TestListStar(");
		t1.print();
		System.out.println(")");

	}

}
