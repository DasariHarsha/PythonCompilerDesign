package AST;

public class RaiseStmt implements ASTNode {
	ASTNode t1;
	

	public RaiseStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("RaiseStmt(");
		t1.print();
		System.out.println(")");

	}

}
