package AST;

public class GlobalStmta implements ASTNode {
	ASTNode t1;
	

	public GlobalStmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("GlobalStmta(GLOBAL NAME");
		t1.print();
		System.out.println(")");

	}

}
