package AST;

public class LeftShiftExpr implements ASTNode {
	ASTNode t1;
	

	public LeftShiftExpr(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new LeftShiftExpr(<<,");
		t1.print();
		System.out.println(")");

	}

}
