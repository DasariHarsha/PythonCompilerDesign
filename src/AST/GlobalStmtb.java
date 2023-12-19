package AST;

public class GlobalStmtb implements ASTNode {
	ASTNode t1;
	

	public GlobalStmtb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("GlobalStmtb(COMMA NAME");
		t1.print();
		System.out.println(")");

	}

}
