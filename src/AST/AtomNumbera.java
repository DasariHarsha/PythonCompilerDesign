package AST;

public class AtomNumbera extends AtomAbstract implements ASTNode {
	ASTNode t1;
	

	public AtomNumbera(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AtomNumbera(");
		t1.print();
		System.out.println(")");

	}

}
