package AST;

public class YieldExpr implements ASTNode {
	ASTNode t1;
	

	public YieldExpr(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("YieldExpr(");
		t1.print();
		System.out.println(")");

	}

}
