package AST;

public class FactorMod implements ASTNode {
	ASTNode t1;
	

	public FactorMod(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FactorMod(%, ");
		t1.print();
		System.out.println(")");

	}

}
