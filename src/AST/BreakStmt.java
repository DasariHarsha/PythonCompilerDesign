package AST;

public class BreakStmt extends AtomAbstract implements ASTNode {
	Integer op;
	
	


	public BreakStmt(Integer op) {
		super();
		this.op = op;
	}




	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("BreakStmt( break");
		
		System.out.println(")");

	}

}
