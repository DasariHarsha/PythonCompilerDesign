package AST;

public class RightShiftExpr implements ASTNode {
	ASTNode t1;
	

	public RightShiftExpr(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new RightShiftExpr(>>,");
		t1.print();
		System.out.println(")");

	}

}
