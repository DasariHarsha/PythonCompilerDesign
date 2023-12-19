package AST;

public class FactorStar implements ASTNode {
	ASTNode t1;
	
	
	public FactorStar(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FactorStar(*, ");
		t1.print();
		System.out.println(")");

	}

}
