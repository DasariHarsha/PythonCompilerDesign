package AST;

public class WhileStmt implements ASTNode {
	ASTNode t1;
	
	public WhileStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("WhileStmt(");
		t1.print();
		System.out.println(")");

	}

}
