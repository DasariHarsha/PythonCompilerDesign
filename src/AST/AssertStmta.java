package AST;

public class AssertStmta extends AssertAbstractClass implements ASTNode {
	ASTNode t1;
	

	public AssertStmta(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AssertStmta(ASSERT ");
		t1.print();
		System.out.println(")");

	}

}
