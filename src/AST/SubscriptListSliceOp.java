package AST;

public class SubscriptListSliceOp implements ASTNode {
	ASTNode t1;
	

	public SubscriptListSliceOp(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SubscriptListSliceOp(");
		t1.print();
		System.out.println(")");

	}

}
