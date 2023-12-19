package AST;

public class AtomSq extends AtomAbstract implements ASTNode {
	ASTNode t1;
	
	public AtomSq(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Atom( [");
		t1.print();
		System.out.println("] )");

	}

}
