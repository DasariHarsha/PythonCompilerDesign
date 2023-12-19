package AST;

public class Trailerb implements ASTNode {
	ASTNode t1;
	

	public Trailerb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Trailerb(");
		t1.print();
		System.out.println(")");

	}

}
