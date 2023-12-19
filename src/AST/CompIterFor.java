package AST;

public class CompIterFor extends ComparsionAbstractClass implements ASTNode {
	ASTNode t1;
	

	public CompIterFor(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CompIterFor(");
		t1.print();
		System.out.println(")");

	}

}
