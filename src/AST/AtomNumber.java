package AST;

public class AtomNumber extends AtomAbstract implements ASTNode {
	ASTNode t1;
	

	public AtomNumber(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AtomNumber(");
		t1.print();
		System.out.println(")");

	}

}
