package AST;

public class NotTest implements ASTNode {
	ASTNode t1;
	
	public NotTest(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("NotTest(NOT,");
		t1.print();
		
		System.out.println(")");

	}

}
