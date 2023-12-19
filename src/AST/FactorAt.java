package AST;

public class FactorAt implements ASTNode {
	ASTNode t1;
	

	public FactorAt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FactorAt(*, ");
		t1.print();
		System.out.println(")");

	}

}
