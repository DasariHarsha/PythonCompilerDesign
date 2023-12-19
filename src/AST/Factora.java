package AST;

public class Factora implements ASTNode {
	ASTNode t1;
	

	public Factora(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Factora(MINUS, ");
		t1.print();
		System.out.println(")");

	}

}
