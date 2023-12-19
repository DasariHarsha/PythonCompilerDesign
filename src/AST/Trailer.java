package AST;

public class Trailer implements ASTNode {
	ASTNode t1;
	

	public Trailer(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Trailer( (");
		t1.print();
		System.out.println(") )");

	}

}
