package AST;

public class NonLocalStmt implements ASTNode {
	ASTNode t1;
	

	public NonLocalStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("NonLocalStmt(");
		t1.print();
		System.out.println(")");

	}

}
