package AST;

public class PassStmt implements ASTNode {
	Integer op;
	

	


	public PassStmt(Integer op) {
		super();
		this.op = op;
	}





	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("PassStmt(");
		switch(op)
		{
		case 1: System.out.println("PASS, ");
				break;
		}
		System.out.println(")");

	}

}
