package AST;

public class Typedargslistr implements ASTNode {
	ASTNode t1;
	
	public Typedargslistr(ASTNode t1) {
		super();
		this.t1 = t1;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslistr(");
		t1.print();
		System.out.println(")");
	}

}
