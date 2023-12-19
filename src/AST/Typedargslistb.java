package AST;

public class Typedargslistb implements ASTNode {
	ASTNode t1;
	
	public Typedargslistb(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslistb(");
		t1.print();
		System.out.println(")");

	}

}
