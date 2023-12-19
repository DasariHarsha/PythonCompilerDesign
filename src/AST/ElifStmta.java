package AST;

public class ElifStmta extends ElifExpressionAbstract implements ASTNode {
	ASTNode t1;
	

	public ElifStmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ElifStmta(ELSE:,");
		t1.print();
		System.out.println(")");

	}

}
