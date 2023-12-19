package AST;

public class ForStmt implements ASTNode {
	ASTNode t1;
	

	public ForStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ForStmt(");
		t1.print();
		System.out.println(")");

	}

}
