package AST;

public class Tfpdef implements ASTNode {
	ASTNode t1;
	

	public Tfpdef(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Tfpdef(");
		t1.print();
		System.out.println(")");

	}

}
