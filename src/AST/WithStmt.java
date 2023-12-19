package AST;

public class WithStmt implements ASTNode {
	ASTNode t1;
	

	public WithStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("WithStmt(");
		t1.print();
		System.out.println(")");

	}

}
