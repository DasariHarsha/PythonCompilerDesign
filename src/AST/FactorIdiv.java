package AST;

public class FactorIdiv implements ASTNode {
	ASTNode t1;
	

	public FactorIdiv(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FactorIdiv(//, ");
		t1.print();
		System.out.println(")");

	}

}
