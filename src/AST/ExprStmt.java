package AST;

public class ExprStmt extends ElifExpressionAbstract implements ASTNode {
	ASTNode t1;
	

	public ExprStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ExprStmt(");
		t1.print();
		System.out.println(")");

	}

}
