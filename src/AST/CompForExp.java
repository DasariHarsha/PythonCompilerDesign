package AST;

public class CompForExp extends ComparsionAbstractClass implements ASTNode {
	ASTNode t1;
	

	public CompForExp(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CompForExp(");
		t1.print();
		System.out.println(")");

	}

}
