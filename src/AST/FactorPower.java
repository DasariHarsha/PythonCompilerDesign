package AST;

public class FactorPower implements ASTNode {
	ASTNode t1;
	

	public FactorPower(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FactorPower(");
		t1.print();
		System.out.println(")");

	}

}
