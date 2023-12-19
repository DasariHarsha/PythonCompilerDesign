package AST;

public class IfStmt implements ASTNode {
	ASTNode t1;
	

	public IfStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("IfStmt(");
		t1.print();
		System.out.println(")");

	}

}
