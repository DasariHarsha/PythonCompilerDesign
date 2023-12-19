package AST;

public class ReturnStmta implements ASTNode {
	ASTNode t1;
	

	public ReturnStmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ReturnStmta(return ");
		t1.print();
		System.out.println(")");

	}

}
