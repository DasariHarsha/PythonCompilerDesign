package AST;

public class Atom implements ASTNode {
	
	ASTNode t1;
	

	public Atom(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Atom( (");
		t1.print();
		System.out.println(") )");

	}

}
