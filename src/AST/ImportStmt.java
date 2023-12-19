package AST;

public class ImportStmt implements ASTNode {
	ASTNode t1;
	

	public ImportStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ImportStmt(");
		t1.print();
		System.out.println(")");

	}

}
