package AST;

public class CompIterIf extends ComparsionAbstractClass implements ASTNode {
	ASTNode t1;
	

	public CompIterIf(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CompIterIf(");
		t1.print();
		System.out.println(")");

	}

}
