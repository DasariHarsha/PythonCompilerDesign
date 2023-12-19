package AST;

public class YieldArgFunca implements ASTNode {
	ASTNode t1;
	

	public YieldArgFunca(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("YieldArgFunca(FROM,");
		t1.print();
		System.out.println(")");

	}

}
