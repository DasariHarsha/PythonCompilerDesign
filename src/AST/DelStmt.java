package AST;

public class DelStmt extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	

	public DelStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DelStmt(");
		t1.print();
		System.out.println(")");

	}

}
