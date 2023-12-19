package AST;

public class Tfpdefb implements ASTNode {
	ASTNode t1;
	

	public Tfpdefb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Tfpdefb( :");
		t1.print();
		System.out.println(")");

	}

}
