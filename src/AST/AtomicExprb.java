package AST;

public class AtomicExprb extends AtomAbstract implements ASTNode {
	
	ASTNode t1;
	

	public AtomicExprb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AtomicExprb( ");
		t1.print();
		System.out.println(")");

	}

}
