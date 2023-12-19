package AST;

public class FlowStmt implements ASTNode {
	ASTNode t1;
	

	public FlowStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FlowStmt(");
		t1.print();
		System.out.println(")");

	}

}
