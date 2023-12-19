package AST;

public class Trailera implements ASTNode {
	ASTNode t1;
	

	public Trailera(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Trailera( [");
		t1.print();
		System.out.println("] )");

	}

}
