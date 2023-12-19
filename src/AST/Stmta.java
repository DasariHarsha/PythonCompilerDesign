package AST;

public class Stmta implements ASTNode {
	ASTNode t1;
	

	public Stmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Stmta(");
		t1.print();
		System.out.println(")");

	}

}
