package AST;

public class GlobalStmt implements ASTNode {
	ASTNode t1;
	

	public GlobalStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("GlobalStmt(");
		t1.print();
		System.out.println(")");

	}

}
