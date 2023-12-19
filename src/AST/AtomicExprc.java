package AST;

public class AtomicExprc extends AtomAbstract implements ASTNode {
	ASTNode t1;
	
	public AtomicExprc(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AtomicExprc( ");
		t1.print();
		System.out.println(")");

	}

}
