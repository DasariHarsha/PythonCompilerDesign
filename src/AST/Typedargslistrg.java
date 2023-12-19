package AST;

public class Typedargslistrg implements ASTNode {
	ASTNode t1;
	

	public Typedargslistrg(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Typedargslistrg(");
		System.out.println("** ");
		t1.print();
		System.out.println(")");
		

	}

}
