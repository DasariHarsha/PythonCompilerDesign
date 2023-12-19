package AST;

public class RaiseStmta implements ASTNode {
	ASTNode t1;
	
	

	public RaiseStmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}



	@Override
	public void print() {
		System.out.println("RaiseStmta( RAISE");
		t1.print();
		System.out.println(")");
	}

}
