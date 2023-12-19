package AST;

public class Typedargslistc implements ASTNode {
	ASTNode t1;
	

	public Typedargslistc(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslistc(");
		t1.print();
		System.out.println(")");

	}

}
