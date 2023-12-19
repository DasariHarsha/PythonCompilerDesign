package AST;

public class YieldArgFunc implements ASTNode {
	ASTNode t1;
	

	public YieldArgFunc(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("YieldArgFunc(");
		t1.print();
		System.out.println(")");

	}

}
