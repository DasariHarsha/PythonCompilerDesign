package AST;

public class Factorb implements ASTNode {
	ASTNode t1;
	

	public Factorb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Factorb(NOT_OP, ");
		t1.print();
		System.out.println(")");

	}

}
