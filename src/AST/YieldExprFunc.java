package AST;

public class YieldExprFunc implements ASTNode {
	ASTNode t1;
	

	public YieldExprFunc(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("YieldExprFunc(YIELD,");
		t1.print();
		System.out.println(")");

	}

}
