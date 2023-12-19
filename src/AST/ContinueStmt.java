package AST;

public class ContinueStmt extends ComparsionAbstractClass implements ASTNode {
	Integer op;
	
	public ContinueStmt(Integer op) {
		super();
		this.op = op;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
System.out.println("ContinueStmt( continue");
		
		System.out.println(")");

	}

}
