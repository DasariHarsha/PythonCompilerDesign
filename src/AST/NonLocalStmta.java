package AST;

public class NonLocalStmta implements ASTNode {
	ASTNode t1;
	

	public NonLocalStmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("NonLocalStmta(NONLOCAL NAME ");
		t1.print();
		System.out.println(")");

	}

}
