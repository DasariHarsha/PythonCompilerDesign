package AST;

public class CompFor extends ComparsionAbstractClass implements ASTNode {
	ASTNode t1;
	
	
	public CompFor(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CompFor(");
		t1.print();
		System.out.println(")");

	}

}
