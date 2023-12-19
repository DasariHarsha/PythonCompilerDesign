package AST;

public class Typedargslistri implements ASTNode {
	ASTNode t1;
	

	public Typedargslistri(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslistri(");
		t1.print();
		System.out.println(")");

	}

}
