package AST;

public class LambdaDefFunc implements ASTNode {
	ASTNode t1;
	

	public LambdaDefFunc(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("LambdaDefFunc(");
		t1.print();
		System.out.println(")");

	}

}
