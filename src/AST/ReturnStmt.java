package AST;

public class ReturnStmt implements ASTNode {
	ASTNode t1;
	

	public ReturnStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ReturnStmt(");
		t1.print();
		System.out.println(")");

	}

}
