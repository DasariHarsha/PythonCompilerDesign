package AST;

public class Parameters implements ASTNode {
	ASTNode t1;
	
 
	public Parameters(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Parameters(");
		t1.print();
		System.out.println(")");

	}

}
