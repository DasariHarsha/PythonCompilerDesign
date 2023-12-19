package AST;

public class ExprStmtb extends ElifExpressionAbstract implements ASTNode {
	ASTNode t1;
	

	public ExprStmtb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ExprStmtb(");
		t1.print();
		System.out.println(")");

	}

}
