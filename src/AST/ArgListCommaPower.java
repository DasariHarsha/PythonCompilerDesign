package AST;

public class ArgListCommaPower extends ArgumentsClasses implements ASTNode {
	ASTNode t1;
	

	public ArgListCommaPower(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ArgListCommaPower(COMMA, POWER,");
		t1.print();
		System.out.println(")");

	}

}
