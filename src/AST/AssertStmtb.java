package AST;

public class AssertStmtb extends AssertAbstractClass implements ASTNode {
	ASTNode t1;
	

	public AssertStmtb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AssertStmtb(COMMA ");
		t1.print();
		System.out.println(")");

	}

}
