package AST;

public class Factorc implements ASTNode {
	ASTNode t1;
	
	public Factorc(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Factorc(ADD, ");
		t1.print();
		System.out.println(")");
		

	}

}
