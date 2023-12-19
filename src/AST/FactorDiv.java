package AST;

public class FactorDiv implements ASTNode {
	
	ASTNode t1;
	
	public FactorDiv(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FactorDiv(/, ");
		t1.print();
		System.out.println(")");

	}

}
