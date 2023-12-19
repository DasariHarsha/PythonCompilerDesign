package AST;

public class TryStmt implements ASTNode {
	ASTNode t1;
	

	public TryStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TryStmt(");
		t1.print();
		System.out.println(")");

	}

}
